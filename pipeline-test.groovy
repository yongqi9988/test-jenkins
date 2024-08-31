pipeline{

    agent any

    stages{

        stage('BUILD'){
            steps{
                echo "Creating builod for ${params.ENVIRONMENT} on ${params.PLATFORM} platform"
            }
        }

        stage('RUN AUTOMATION'){
            steps{
                echo "Running Automation on ${params.BROWSER} browser"
            }
        }

        stage('DEPLOY'){
            steps{
                echo "Deploying on ${params.ENVIRONMENT} server"
            }
        }
    }


    post{
        success{
            echo "Pipeline completed successfully"
        }
        failure{
            echo "Pipeline failed"
        }
    }

}