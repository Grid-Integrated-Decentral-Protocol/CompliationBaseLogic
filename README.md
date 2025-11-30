# GIDP P2P Network Simulation

[![Java](https://img.shields.io/badge/Java-17%2B-orange)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)]()

## 📖 Project Overview

**CompliationBaseLogic** (GIDP Simulation) is a Java-based research and development project designed to simulate a distributed, peer-to-peer (P2P) network environment. 

The primary objective is to emulate low-level Ethernet behaviors to test the **Grid Integrated Decentral Protocol (GIDP)**. By creating a controlled simulation of network tools, nodes, and data transfer, this project aims to predict how a fully decentralized web application will behave in a real-world environment.



[Image of Peer-to-Peer Network Topology]


## 🎯 Goals

The main goals of this repository are to:

1.  **Test Core Ideas:** Validate the organizational ideas behind the GIDP architecture.
2.  **Observe Results:** Analyze traffic patterns, latency handling, and node interactions in a simulated environment before physical deployment.
3.  **Prototype Web3 Infrastructure:** Pave the way for next-generation decentralized websites by solving fundamental networking challenges.

## 🏗 Architecture

The project is structured into two main logical layers:

### 1. Network Layer (`com.gidp.p2psimulation.network`)
This layer acts as the "physical" infrastructure simulation. It handles:
* **NetworkManager:** Lifecycle management of virtual networks.
* **Network:** The medium for connection, routing, and partitioning.
* **Packet Switching:** Simulation of data frames transferring between peers.

### 2. Application Layer (`com.gidp.p2psimulation.gidpapp`)
This layer implements the specific **GIDP** logic. It uses the underlying Network Layer to:
* Mimic decentralized web application behavior.
* Execute protocol-specific handshakes and data exchanges.
* Manage peer roles (Client, Server, Validator).

## 🚀 Key Features (Planned)

* [ ] **Custom Latency Modeling:** Simulating distance and network congestion.
* [ ] **Dynamic Topology:** Nodes joining and leaving the network in real-time.
* [ ] **Packet Inspection:** detailed logging of data flow for debugging.
* [ ] **Protocol Verification:** Automated tests to ensure GIDP rules are followed.

## 🛠 Getting Started

### Prerequisites
* Java Development Kit (JDK) 17 or higher
* Maven

### Installation

```bash
git clone [https://github.com/your-username/CompliationBaseLogic.git](https://github.com/your-username/CompliationBaseLogic.git)
cd CompliationBaseLogic
./mvnw clean install
