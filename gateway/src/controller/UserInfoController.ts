import axios from "axios";
import { NextFunction, Request, Response } from "express";

const microserviceaurl = process.env.MICRO_SERVICE_A_URL;

export default class UserInfoController {
    async getUser(req: Request, res: Response, next: NextFunction) {
        try {
            const headers = { securityToken: req.headers?.securitytoken };
            const params = {
                id_user: req.query['id_user']
            };
            const result = await axios.get(`${microserviceaurl}/users/info`, { headers : headers, params: params });
            const responseData = result.data;

            res.json(responseData);
        } catch (err) {
            next(err);
        }
    }
}