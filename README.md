# TP_Java - Bibliothèque

---

## Sommaire

* [Objectif](#objectif)
* [Structure du projet](#structure-du-projet)
* [Fonctionnalités](#fonctionnalités)
* [Lancer le projet](#lancer-le-projet)
* [Prérequis](#prérequis)

---

## Objectif

Mettre en pratique les bases de Java :

* Manipulation des classes et objets
* Utilisation des collections (`List`)
* Méthodes statiques
* Organisation et structuration du code

---

## Structure du projet

```
TP_Java/
├── Book.java        // Classe représentant un livre
├── TestRunner.java  // Classe principale pour tester le programme
├── build/           // Dossier contenant les fichiers compilés
└── README.md
```

---

## Fonctionnalités

* Création de livres
* Stockage automatique dans une bibliothèque
* Affichage de tous les livres
* Test du fonctionnement via une classe principale

---

## Lancer le projet

### 1. Compiler

```bash
javac Book.java TestRunner.java -d build
```

### 2. Exécuter

```bash
java -cp build TestRunner
```

---

## Prérequis

* Java JDK installé (version 8 ou supérieure)
* Terminal (cmd, PowerShell, ou WSL)

---
