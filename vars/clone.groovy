def call(String url, String branch){
  echo 'Code Cloning'
  git url: "${url}", branch: "${branch}"
  echo 'Code Cloned'
}
