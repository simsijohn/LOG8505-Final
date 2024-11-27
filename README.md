# ProjectD2
 Deliverable2 for Model Driven Engineering Project

# **System Activity Blank Diagram - Domain-Specific Modeling Language (DSML)**

## **Project Overview**
This project focuses on designing a **Domain-Specific Modeling Language (DSML)** for the **System Activity Blank Diagram** using **Model-Driven Software Development (MDSD)** principles. The goal is to provide a robust tool that enables users to model and analyze system activities with domain-specific constructs, ensuring consistency and correctness through constraints and validation mechanisms.

## **Features**
**Metamodel Transformation**: 
  - Converted the **OML vocabulary** into an **Ecore-based metamodel**.
  - Defined core concepts: **Capabilities, Actors, Components, Chains, and Exchanges**.
  
**OCL Constraints**:
  - Ensured well-formedness of models using **Object Constraint Language (OCL)**.

**Diagram Editor**:
  - Developed using **Eclipse Sirius**.
  - Features a palette for adding and managing diagram elements with a drag-and-drop interface.
  - Real-time validation of constraints.

**Query Integration**:
  - Supported queries for retrieving and analyzing model data.
  - Examples include:
    - Listing specialized Capabilities.
    - Validating Exchanges within Chains.

## **Installation**
1. Clone the repository:
```
git clone https://github.com/VinasRicard/LOG8505E-ProjectD2.git
```
  

3.	Import the project into Eclipse IDE with the necessary plugins:
	•	Eclipse Sirius
	•	EMF (Eclipse Modeling Framework)
	3.	Open the .ecore and Sirius project files to access the metamodel and diagram editor.

Usage

1.	Open the System Activity Blank Diagram editor in Eclipse.
2.	Create an Instance of the Model.
3.	Import our Runtime project.
4.	Select the Diagram in representation.aird file
5.	Use the palette to create model elements such as Capabilities, Actors, and Components.
6.	Use the palette to add edges between the elements.
7.	Validate the model for constraint violations.
8.	Run predefined queries to extract insights from the model.

Team Members 

Ricard Viñas, Simsi John, Tomas Hanzlik	
