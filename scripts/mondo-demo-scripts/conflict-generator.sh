log !/bin/sh

LOG="/home/vialpando/Eclipse/Mondo/example/conflict.log"

timestamp() {
  date +"%Y-%m-%d_%H-%M-%S"
}

log() {
  echo "$(timestamp) $1" 1>>$LOG
}

log "======================================================="
log "Clear"
rm -rf /svn/*
log "Create repository"
svnadmin create /svn/conflict
log "Add permisson"
chown -R www-data:www-data /svn/conflict/
log "Restart apache"
/etc/init.d/apache2 restart
log "Clear temp svn"
rm /home/vialpando/Eclipse/Mondo/example/conflict.log
rm -rf /home/vialpando/Eclipse/Mondo/example/tempConflictA
mkdir /home/vialpando/Eclipse/Mondo/example/tempConflictA
rm -rf /home/vialpando/runtime-Bob
mkdir /home/vialpando/runtime-Bob
chmod 777 /home/vialpando/runtime-Bob
log "Checkout the repository into A"
svn co http://127.0.0.1/svn/conflict /home/vialpando/Eclipse/Mondo/example/tempConflictA  --username admin --password admin --quiet --non-interactive
log "Copy original project"
cp -r /home/vialpando/Eclipse/Mondo/git/mondo-collab-framework/mondo-server-hooks/svn/test.project.with.model.project/* /home/vialpando/Eclipse/Mondo/example/tempConflictA/
cp -r /home/vialpando/Eclipse/Mondo/git/mondo-collab-framework/mondo-server-hooks/svn/test.project.with.model.project/.project /home/vialpando/Eclipse/Mondo/example/tempConflictA/.project
log "Step into that A"
cd /home/vialpando/Eclipse/Mondo/example/tempConflictA
log "Add everything"
svn add --force * --auto-props --parents --depth infinity -q
svn add .project
log "Commit initial"
svn commit -m "Initial commit" --username admin --password admin --quiet --non-interactive
log "Checkout the repository into B"
svn co http://127.0.0.1/svn/conflict /home/vialpando/runtime-Bob/test.project.with.model.project  --username admin --password admin --quiet --non-interactive
log "Copy modified models"
cp /home/vialpando/Eclipse/Mondo/example/tempConflictA/modified_a.wtspec4m /home/vialpando/Eclipse/Mondo/example/tempConflictA/original.wtspec4m
cp /home/vialpando/runtime-Bob/test.project.with.model.project/modified_b.wtspec4m /home/vialpando/runtime-Bob/test.project.with.model.project/original.wtspec4m
log "Commit from A"
svn status
svn commit /home/vialpando/Eclipse/Mondo/example/tempConflictA/original.wtspec4m -m "Modified from A" --username admin --password admin
log "Create Conflict"
svn status
svn commit /home/vialpando/runtime-Bob/test.project.with.model.project/original.wtspec4m -m "Modified from B" --username admin --password admin
svn log -r COMMITTED --username admin --password admin
MSG=$(svn log -r COMMITTED --username admin --password admin)
log "$MSG"
log "Finished"
