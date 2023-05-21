import { Router } from "express";
import UserInfoController from "../controller/UserInfoController";

const routes = Router();

routes.get('/', new UserInfoController().getUser);

export default routes;