---
layout: page
title: Yeo Ke Xin's Project Portfolio Page
---

## Project: Projact 
Projact is a contact and project management app that helps NUS computing students to organise their contacts and their projects' meeting links and tasks.
 
Given below are my contributions to the project.

#### New Features
* **Feature**: Command to edit Tag's names. (Pull request [\#109](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/109))
  * What it does: allows the user to change the name of a tag for all its occurrences. 
  * Highlights: This implementation was challenging as it affected contacts with the edited Tag. 
  * Justification: improves user's experience by providing an easy way to correct their mistakes.

* **Feature**: JSON Storage for Tags with their names, tasks and meeting links. (Pull requests [\#109](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/109), [\#142](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/142))
  * What it does: allows users' data to be saved and loaded upon the next usage of the app.
  * Highlights: This feature affects existing and future tag commands. 

* **Feature**: Command to clear all completed tasks from a Tag. (Pull request [\#224](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/224))
  * Justification: increase user's convenience by providing a way to mass delete completed tasks from a Tag.
  
#### Enhancements to Existing Features
* **Enhancement**: New Telegram Address field in Person's model. (Pull requests [\#68](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/68), [\#209](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/209))
  * Justification: improves the product since users can store a more relevant contact method.
  * Highlights: This enhancement affects existing contact commands.

* **Enhancement**: Removed Address field in Person's model. (Pull request [\#68](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/68))
  * Justification: It is uncommon for target users to know or save their acquaintances' address.

* **Enhancement**: Refined regex for valid emails. (Pull request [\#218](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/218))

* **Enhancement**: Edited ModelManager and Tag's model to support new features. (Pull requests [\#109](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/109), [\#113](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/113))
  * Highlights: This enhancement affects existing contact, tag, link and task commands.

* **Enhancement**: Edited existing commands to update Tag's UI. (Pull requests [\#113](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/113), [\#135](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/135))
  * Highlights: This enhancement was difficult as it required modifying existing commands.

* **Enhancement**: Improved the GUI by adding icons and removing blank spaces. (Pull request [\#216](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/216))
  * Credits: Used [FontAwesome5](https://github.com/kordamp/ikonli) for the icons.
 
#### Code Contributed
* [RepoSense link](https://nus-cs2103-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=pockii&sort=groupTitle&sortWithin=title&since=2020-08-14&until=2020-11-09&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other)

#### Project Management
* Managed the issue tracker for v1.1
* Created the demo screenshots to be shown for v1.3

#### Documentation    
* **User Guide**:
    * Updated the Introduction and About the User Guide. (Pull requests [\#147](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/147), [\#222](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/222))
    * Edit UG's format. (Pull request [\#111](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/111))
    * Documented `tagedit` and `taskclear` commands. (Pull requests [\#146](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/146), [\#251](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/251))
    * Edited documentation for `list` command. (Pull request [\#251](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/251))
    
* **Developer Guide**:
    * Updated UML diagrams for Model and Storage. (Pull request [\#251](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/251))
    * Added implementations and use cases of `tagedit` and `taskclear` feature. (Pull requests [\#146](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/146), [\#224](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/224), [\#251](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/251))

#### Community    
* PRs reviewed (with non-trivial review comments): (Pull request [\#69](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/69), [\#116](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/116), [\#118](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/118), [\#119](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/119), [\#139](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/139), [\#237](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/237), [\#247](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/247), [\#249](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/249))

#### Tools
* Integrated a third party library (FontAwesome5) to the project (Pull request [\#216](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/216))


