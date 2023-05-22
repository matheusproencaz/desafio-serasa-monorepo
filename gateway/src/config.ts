import { Kafka } from "kafkajs";
import { ScoreCredito } from "./models/score-credito.model";

class KafkaConfig {
    kafka: Kafka;
    consumer: any;

    constructor() {
        this.kafka = new Kafka({
            clientId: "nodejs-kafka",
            brokers: [process.env.KAFKA_BROKER]
        })
        this.consumer = this.kafka.consumer({ groupId: 'group-1' })
    }

    async consume(topic: string) {
        try {
            await this.consumer.connect();
            await this.consumer.subscribe({ topic: topic });
            await this.consumer.run({
                eachMessage: async ({ message }) => {
                    const { value } = message;
                    const messageString = value.toString();
                    const scores: ScoreCredito[] = JSON.parse(messageString);
                    console.log(scores);
                }
            });
        } catch (error) {
            console.log(error);
        }
    }
}

export default KafkaConfig