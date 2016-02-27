#!/bin/sh

LOG="log/init-demo.log"

timestamp() {
  date +"%Y-%m-%d_%H-%M-%S"
}

log() {
  echo "$(timestamp) $1" 1>>$LOG
}

cd ..
rm -rf log/*
LOG="log/init-demo.log"
log "======================================================="
log "Clear"
rm -rf /svn/*
log "Create repositories"
svnadmin create /svn/gold
svnadmin create /svn/front1
svnadmin create /svn/front2
svnadmin create /svn/test
log "Add permissons"
chown -R www-data:www-data /svn/gold/
chown -R www-data:www-data /svn/front1/
chown -R www-data:www-data /svn/front2/
chown -R www-data:www-data /svn/test/
log "Copy hooks"
cp scripts/mondo-server-hooks/svn/post-commit /svn/gold/hooks/post-commit
chmod 777 /svn/gold/hooks/post-commit
cp scripts/mondo-server-hooks/svn/pre-commit /svn/front1/hooks/pre-commit
chmod 777 /svn/front1/hooks/pre-commit
cp scripts/mondo-server-hooks/svn/pre-commit /svn/front2/hooks/pre-commit
chmod 777 /svn/front2/hooks/pre-commit
log "Restart apache"
/etc/init.d/apache2 restart
log "Clear temp example"
rm -rf /home/mondo/MONDO-Demo/example/*
rm -rf /home/mondo/MONDO-Demo/example/post-commit.log
rm -rf /home/mondo/MONDO-Demo/example/pre-commit.log
rm -rf /home/mondo/MONDO-Demo/example/lens.log
touch /home/mondo/MONDO-Demo/example/post-commit.log
touch /home/mondo/MONDO-Demo/example/pre-commit.log
touch /home/mondo/MONDO-Demo/example/lens.log
chmod 777 /home/mondo/MONDO-Demo/example
chmod 777 /home/mondo/MONDO-Demo/example/pre-commit.log
chmod 777 /home/mondo/MONDO-Demo/example/post-commit.log
chmod 777 /home/mondo/MONDO-Demo/example/pre-commit.log
chmod 777 /home/mondo/MONDO-Demo/example/lens.log
log "Copy test project"
yes | cp -rf project/test.project.with.model.project /home/mondo/MONDO-Demo/admin/workspace
chmod 777 /home/mondo/MONDO-Demo/admin/workspace/test.project.with.model.project
chmod 777 /home/mondo/MONDO-Demo/admin/workspace/test.project.with.model.project/*
chmod 777 /home/mondo/MONDO-Demo/admin/workspace/test.project.with.model.project/.*
log "Copy executor"
yes | cp -rf scripts/lens-executor.sh /home/mondo/MONDO-Demo/lens/run.sh
chmod 777 /home/mondo/MONDO-Demo/lens/run.sh
#log "Copy rules"
#yes | cp -rf rules/queries.eiq /home/mondo/Mondo/lens/queries.eiq
#chmod 777 /home/mondo/Mondo/lens/queries.eiq
#yes | cp -rf rules/rules.macl /home/mondo/Mondo/lens/rules.macl
#chmod 777 /home/mondo/Mondo/lens/rules.macl
log "Create example folders"
mkdir /home/mondo/MONDO-Demo/example/tempFront
chmod 777 /home/mondo/MONDO-Demo/example/tempFront
mkdir /home/mondo/MONDO-Demo/example/tempFront/Current
chmod 777 /home/mondo/MONDO-Demo/example/tempFront/Current
mkdir /home/mondo/MONDO-Demo/example/tempGold
chmod 777 /home/mondo/MONDO-Demo/example/tempGold
log "Online part"
cd example
echo $PWD
rm -rf online_repo
mkdir online_repo
cd online_repo
svn co http://127.0.0.1/svn/test --username test --password test --non-interactive --quiet
cp -rf /home/mondo/MONDO-Demo/admin/git/mondo-collab-framework/demo_content/sample_svn_repo/* test
cd test
svn add --force * --auto-props --parents --depth infinity -q
svn commit -m "Initial online commit" --username admin --password admin --non-interactive --quiet
rm -rf /home/mondo/MONDO-Demo/online/svn_repos/test
