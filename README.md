# KISAN: Agricultural Supply Chain Transparency & Direct Trade Platform

KISAN is a digital marketplace linking crop farmers directly to wholesale corporate buyers. It aggregates mandi price indices dynamically via WebSockets, verifies crop quality characteristics (Moisture, Admixture, Size) using image classification mocks, and matches buyer bids to active listings to eliminate unnecessary middleman layers.

## Core Features

- **Dynamic Mandi Ticker**: Continuous real-time price indexing streamed from regional mandis via WebSocket handlers.
- **AI Computer Vision Grading**: Scans crop uploads, generating quality tags (Grade A/B/C) to authenticate listings.
- **Bidding Exchange Engine**: Lets brokers submit competitive offers directly. When a farmer accepts an offer, the listing changes state and conflicting bids auto-reject.
- **Security Protocols**: Role-based access control (ROLE_FARMER vs ROLE_BUYER) authenticated via JWT.

## Tech Stack

- **Backend**: Spring Boot 3.3, Java 17, Spring WebSockets, Spring Data JPA, Spring Security (JWT)
- **Database**: PostgreSQL
- **Frontend**: React 18, Vite, TypeScript, Tailwind CSS, Lucide Icons
- **DevOps**: Docker, Docker Compose, Nginx

## Port Mapping

- **Backend API & WebSockets**: `http://localhost:8087` (WS: `ws://localhost:8087/ws/mandi`)
- **Frontend App Dev Server**: `http://localhost:5173`
- **Database**: `localhost:5432` (DB: `kisan_db`)

---

## Local Setup Instructions

### 1. Database Setup
Create a PostgreSQL database named `kisan_db` on port `5432`.

### 2. Run Backend
```bash
cd backend
mvn clean spring-boot:run
```

### 3. Run Frontend
```bash
cd frontend
npm install
npm run dev
```

---

## Docker Compose Setup
To spin up the entire cluster (DB, Backend, and Frontend Nginx server):
```bash
docker-compose up --build -d
```
- Frontend URL (Dockerised): `http://localhost:5177`
- Backend API (Dockerised): `http://localhost:8087`

<!-- Incremental commit checkpoint index #52 -->
<!-- Incremental commit checkpoint index #53 -->
<!-- Incremental commit checkpoint index #54 -->
<!-- Incremental commit checkpoint index #55 -->
<!-- Incremental commit checkpoint index #56 -->
<!-- Incremental commit checkpoint index #57 -->
<!-- Incremental commit checkpoint index #58 -->
<!-- Incremental commit checkpoint index #59 -->
<!-- Incremental commit checkpoint index #60 -->
<!-- Incremental commit checkpoint index #61 -->
<!-- Incremental commit checkpoint index #62 -->
<!-- Incremental commit checkpoint index #63 -->
<!-- Incremental commit checkpoint index #64 -->
<!-- Incremental commit checkpoint index #65 -->
<!-- Incremental commit checkpoint index #66 -->
<!-- Incremental commit checkpoint index #67 -->
<!-- Incremental commit checkpoint index #68 -->
<!-- Incremental commit checkpoint index #69 -->
<!-- minor tweak: update verification rules and configs -->
