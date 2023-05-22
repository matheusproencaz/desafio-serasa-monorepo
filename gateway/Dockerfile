FROM node:alpine

WORKDIR /app/api-gateway

COPY package.json ./

RUN npm i

COPY . .

EXPOSE 8085

CMD ["npm", "run", "prod"]
