import { Request, Response, NextFunction } from "express";

const ErrorHandler = (err, req: Request, res: Response, next: NextFunction) => {
    console.log("Middleware Error Handling");
    let errStatus = err.statusCode || 500;
    const errMsg = err.message || 'Something went wrong';
    
    res.status(errStatus).json({
        success: false,
        status: errStatus,
        message: errMsg,
        stack: process.env.NODE_ENV === 'development' ? err.stack : null,
    });
};

export default ErrorHandler;