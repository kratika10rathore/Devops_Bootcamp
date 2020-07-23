node {
    stage('git checkout'){
        git credentialsId: 'krati', url: 'https://github.com/kratika10rathore/cicd-pipeline.git'
        
    }
    stage('Code build & test'){
        def mvnHome = tool name: 'Maven' , type: 'maven'
        def mvnCMD = "${mvnHome}/bin/mvn"
        sh "${mvnCMD} clean package"
    } 
    
    stage("docker build"){
        def dockerHome = tool name: 'Docker', type: 'dockerTool'
        def dockerCMD = "${dockerHome}/bin/docker"
        sh "${dockerCMD} ps"
        sh "${dockerCMD}  --version"
        sh "${dockerCMD} build -t kratika1/cicd:1.2 ."
    }
    
    stage("docker push"){
        def dockerHome = tool name: 'Docker', type: 'dockerTool'
        def dockerCMD = "${dockerHome}/bin/docker"
        withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'password', usernameVariable: 'username')]) {
        sh "${dockerCMD} login -u ${username} -p ${password}"
        }
        
        sh "${dockerCMD} push kratika1/cicd:1.2"
}
    stage("docker run"){
        def dockerHome = tool name: 'Docker', type: 'dockerTool'
        def dockerCMD = "${dockerHome}/bin/docker"
        sh "${dockerCMD} run -p 8088:9999 -d kratika1/cicd:1.2"
    }
    
    
}
