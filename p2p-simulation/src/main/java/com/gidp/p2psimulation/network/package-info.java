/**
 * Provides the core components and infrastructure for simulating a distributed,
 * peer-to-peer (P2P) Ethernet-like network environment suitable for testing
 * Web3-style architectures.
 *
 * <h3>Key Components and Responsibilities:</h3>
 * * <ul>
 * <li>
 * **`NetworkManager`**:
 * The primary entry point for managing the simulated network environment.
 * It is responsible for the lifecycle management of `Network` objects,
 * including creation, configuration, listing, and destruction of distinct
 * simulated network segments.
 * *(`Manages the collection of all virtual networks`)*.
 * </li>
 * <li>
 * **`Network`**:
 * Represents a single, isolated segment of the simulated distributed network
 * (e.g., a "sub-mesh" * or the entire simulated Ethernet fabric). It handles
 * the routing, latency modeling, * and connectivity state between various **`
 * Peer`** objects (clients, servers, * or hybrid nodes).
 * *(`Models the physical/logical connection medium`)*.
 * </li>
 * <li>
 * **`Peer`** (Planned):
 * Represents a single node (client, server, miner, validator, etc.)
 * participating in the distributed system. It interacts with the `Network`
 * to send and receive data. This class abstracts the actual application
 * logic running on the node.
 * *(`The endpoint/node in the simulation`)*.
 * </li>
 * <li>
 * **`NetworkPackage`** (or `Packet`/`Frame`):
 * The fundamental data unit transferred across the `Network`. This class
 * encapsulates the payload, source and destination addresses (e.g., MAC or
 * IP-like addresses), and potentially metadata like timestamps or simulated
 * transmission priority/size.
 * *(`The transferred data unit`)*.
 * </li>
 * </ul>
 * * <h3>Simulation Focus:</h3>
 * The classes within this package aim to simulate core networking challenges
 * critical to Web3 systems, such as **latency**, **partitioning**, and
 * **message ordering** within a non-centralized environment.
 * * @since 1.0
 */
package com.gidp.p2psimulation.network;
