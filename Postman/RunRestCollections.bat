start cmd.exe /k xmysql -h sql7.freemysqlhosting.net -u sql7373576 -p VCspp12dI2  -d sql7373576 
timeout 30
newman run HealthyFoodSocialNetwork.postman_collection.json -e HFSN.postman_environment.json -r htmlextra
