# RabbitMQ-HelloWorld
Very simple example application which uses RabbitMQ to pass messages between a producer (Send.java) and a consumer (Recev.java)

[Code taken from the RabbitMq tutorial](https://www.rabbitmq.com/tutorials/tutorial-one-java.html)

# Usage

1. [Install RabbitMQ](https://www.rabbitmq.com/download.html)
2. Start `rabbitmq-server`
3. Clone the repo
4. Open Exlipse and click File > Import > Existing Maven Projects...
5. Project should import with required dependancies, if not run as Maven build with goal `package`
6. Run Send and Recv classes as Java application in any order and observe terminal output. Repeatedly running Send will send new messages. 
