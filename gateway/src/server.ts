import express from 'express';
import cors from 'cors';
import { routes } from './routes';
import dotenv from 'dotenv';
import KafkaConfig from './config';
import ErrorHandler from './services/ErrorHandler';
dotenv.config();

const app = express();
const PORT = process.env.APP_PORT;

const kafka = new KafkaConfig();

kafka.consume("score-credito-topic");

app.use(express.json());
app.use(cors());
app.use(routes);

app.use(ErrorHandler);
app.listen(PORT, () => console.log(`Listening on PORT: ${PORT}`));