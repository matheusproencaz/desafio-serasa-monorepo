import { Response, Router } from 'express';
import ScoreRoutes from './score.route';
import UserRoutes from './user.route';
const routes = Router();

routes.get('/health', (_, res: Response) => res.json("It's UP!"));
routes.use('/scores', ScoreRoutes);
routes.use('/user', UserRoutes);

export { routes };
