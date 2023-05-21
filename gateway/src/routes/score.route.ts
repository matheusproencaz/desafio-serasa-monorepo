import { Router } from "express";
import ScoreController from "../controller/ScoreController";

const routes = Router();

routes.get('/', new ScoreController().getScore);

export default routes;