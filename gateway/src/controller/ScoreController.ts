import { Response, NextFunction } from "express";
import KafkaConfig from "../config";
import axios from "axios";
import dotenv from 'dotenv';
dotenv.config();

const kafkaConfig = new KafkaConfig();
const microsserviceburl = process.env.MICRO_SERVICE_B_URL;

export default class ScoreController {
    async getScore(_, res: Response, next: NextFunction){
        try {
            await axios.get(`${microsserviceburl}/send-score`);
            return res.json();
        } catch(err) {
            next(err);
        }
    }
}
