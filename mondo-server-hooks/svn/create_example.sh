log !/bin/sh

LOG="/home/vialpando/Eclipse/Mondo/example/create.log"

timestamp() {
  date +"%Y-%m-%d_%H-%M-%S"
}

log() {
  echo "$(timestamp) $1" 1>>$LOG
}

log "======================================================="
log "Clear"
rm -rf /svn/*
log "Create repositories"
svnadmin create /svn/gold
svnadmin create /svn/front1
svnadmin create /svn/front2
log "Add permissons"
chown -R www-data:www-data /svn/gold/
chown -R www-data:www-data /svn/front1/
chown -R www-data:www-data /svn/front2/
log "Copy hooks"
cp /home/vialpando/Eclipse/Mondo/git/mondo-collab-framework/mondo-server-hooks/svn/post-commit /svn/gold/hooks/post-commit
cp /home/vialpando/Eclipse/Mondo/git/mondo-collab-framework/mondo-server-hooks/svn/pre-commit /svn/front1/hooks/pre-commit
cp /home/vialpando/Eclipse/Mondo/git/mondo-collab-framework/mondo-server-hooks/svn/pre-commit /svn/front2/hooks/pre-commit
log "Restart apache"
/etc/init.d/apache2 restart
log "Clear temp svn"
rm -rf /home/vialpando/Eclipse/Mondo/example/tempsvn/*
rm -rf /home/vialpando/Eclipse/Mondo/example/tempsvn/.metadata
rm -rf /home/vialpando/Eclipse/Mondo/example/tempsvn/.svn
rm -rf /home/vialpando/Eclipse/Mondo/example/tempsvn/.log
rm -rf /home/vialpando/Eclipse/Mondo/example/gold
rm -rf /home/vialpando/Eclipse/Mondo/example/front1
log "Checkout gold"
svn co http://127.0.0.1/svn/gold /home/vialpando/Eclipse/Mondo/example/gold  --username admin --password admin --quiet --non-interactive
log "Copy original model"
cp /home/vialpando/Eclipse/Mondo/git/mondo-collab-internal/ikerlan-related/es.ikerlan.wt.emf.security.example/src/es/ikerlan/wt/emf/security/example/gold/test.wtspec4m /home/vialpando/Eclipse/Mondo/example/gold/example.wtspec4m
log "Step into that folder"
cd /home/vialpando/Eclipse/Mondo/example/gold
log "Add to SVN the new file"
svn add example.wtspec4m
log "Commit to gold repo"
svn commit example.wtspec4m -m "Initial commit to gold repo" --username admin --password admin --quiet --non-interactive
log "Checkout front1"
svn co http://127.0.0.1/svn/front1 /home/vialpando/Eclipse/Mondo/example/front1  --username alice --password alice --quiet --non-interactive
log "Copy modified model"
cp -rf /home/vialpando/Eclipse/Mondo/git/mondo-collab-internal/ikerlan-related/es.ikerlan.wt.emf.security.example/src/es/ikerlan/wt/emf/security/example/front/test.wtspec4m /home/vialpando/Eclipse/Mondo/example/front1/example.wtspec4m
log "Step into that folder"
cd /home/vialpando/Eclipse/Mondo/example/front1
#log "Add to SVN the new file"
#svn add example.wtspec4m
log "Commit to gold repo"
svn commit example.wtspec4m -m "Modified by Alice" --username alice --password alice --quiet --non-interactive
log "Finished"
