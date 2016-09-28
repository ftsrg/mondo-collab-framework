# MONDO Collaboration Framework (WP4) 

The MONDO Collaboration Framework, initially developed by Work Package 4 of the MONDO project ([main website](http://www.mondo-project.org/), [source code artifacts](http://mondo-project.github.io/)), enables online and offline collaboration of engineers on models hosted in a repository (currently SVN), with support for seamless access control for security and property-based locking for coordination.

The design of MONDO Collaboration Framework, along with "Getting Started" instructions, is presented in the MONDO report [D4.4 "Prototype Tool for Collaborative Modeling"](http://api.ning.com/files/zxy*xRp5iQ6LLKU5M6eSyBVlaao5Ny7RJkjcW3*jy-ifXPp-aEnLUWxO0vhL4-FC*HDkG0tp33xFcGZAGT5MBBhg49QwWiB2/D4.4Prototypetoolforcollaboration.pdf).

This repository hold the core components of the MONDO Collaboration Framework that are independent of the application domain; any actual usage requries metamodel-specific plugins to make the core components aware of the application domain. A few such demonstrative adaptations are available at the following external repositories:
 * [MONDO DEMO: Wind Turbine Case study](https://github.com/mondo-project/mondo-demo-wt) contains a full application of the collaboration framework to an industrial case study of MONDO, along with demonstrators of several other MONDO results. The case study features a sample modeling language aimed at the model-driven design of Wind Turbine Control Systems.
 * [MONDO DEMO: BIM Case study](https://github.com/mondo-project/mondo-demo-bim) contains a partial application of the collaboration framework (offline scenario, access control only) to another industrial case study. The case study uses Building Information Models represented as IFC files. 
 * [MODELS 2016 reproduction kit](https://github.com/debrecenics/MODELS16) contains a partial application of the collaboration framework (online scenario without user interface) to a modified version of the Wind Turbine case study. The goal of this application is to measure the performance of the core access control component, in order to provide reproducible experimental results for our paper ["Query-based Access Control for Secure Collaborative Modeling Using Bidirectional Transformations"](https://inf.mit.bme.hu/en/research/publications/query-based-access-control-secure-collaborative-modeling-using-bidirectional-t) presented at the [ACM/IEEE 19th International Conference on Model Driven Engineering Languages and Systems (MODELS 2016)](http://models2016.irisa.fr/). 

The repository features Eclipse plugins written in Java and Xtend, built using Maven, and deployed in an Eclipse update site.  Instructions on installing and / or building are available for each of the application cases listed above. 

Build artifacts:
 * [![Build Status](https://build.inf.mit.bme.hu/jenkins/job/MONDO-Collaboration/badge/icon)](https://build.inf.mit.bme.hu/jenkins/job/MONDO-Collaboration)
 * [Update Site](http://mondo.inf.mit.bme.hu/web/mondo-collaboration/update/)
 * [Compressed Site (.zip)](https://build.inf.mit.bme.hu/jenkins/view/All/job/MONDO-Collaboration/lastSuccessfulBuild/artifact/releng/org.mondo.collaboration.security.updatesite/target/org.mondo.collaboration.security.updatesite-1.0.0-SNAPSHOT.zip)
