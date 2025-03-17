# Spring-microservice-kafka

# 1° Passo
Link para baixar o kafka: https://kafka.apache.org/downloads

# 2° Passo
Criar uma pasta na unidade C configurar as variáveis de ambiente.

# 3° Passo
Configurar o arquivo do zookeeper alterando o comando que está lá para o comando onde está
está o arquivo, na minha máquina está nesse caminho na sua máquina vc tem que ver em qual 
caminho está:
dataDir=C:/kafka/kafka_2.12-3.9.0/zookeeper

# 4° Passo
Configurar o arquivo do server alterando o comando que está lá para o comando onde está
está o arquivo, na minha máquina está nesse caminho na sua máquina vc tem que ver em qual 
caminho está:
log.dirs=C:/kafka/kafka_2.12-3.9.0/config/kafka-logs

# 5° Passo
Feito isso acessar a pasta do kafka e rodar esse comando: 
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# 6° Passo
Depois rodar o comando:
.\bin\windows\kafka-server-start.bat .\config\server.properties

# 7° Passo
Depois rodar o comando para ver se todos os serviços estão em pé:
jps

