---
layout: page
title: Ng Si Qiang's Project Portfolio Page
---

### Project: Projact 
Projact is a contact and project management app that helps NUS computing students to
 organise their contacts and their projects' meeting links and tasks. 

Given below are my contributions to the project.


#### New Features Added
* **Feature**: Command to list all the tags in the tag list. (Pull request [\#57](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/57))
  * Justification: allows the user to keep track of all the tags that have been added.
  * Highlights: This feature helps to display all the tag command results. 

* **Feature**: Commands to sort person list and taglist. 
(Pull requests [\#116](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/116), [\#120](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/120),
[\#223](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/223))
  * What it does: allows the user to sort the contact names in the person list or the tag names in the tag list in alphanumerical order. 
  * Justification: allows the user to view lists based on their personal preference.  
  * Highlight: This implementation was challenging because it uses SortedList, rather than the Filtered List that the UI used to display the lists. 
    It also affects the original commands so there are many design considerations required.
  
* **Feature**: Command to delete the link in a tag. (Pull request [\#138](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/138))
 * Justification: This feature improves the product as the user is able to add a link and needs a way to remove the link from the tag as well.
  
* **Feature**: Command to mark a task in a tag as done. 
(Pull requests [\#139](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/139), [\#204](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/204))
  * Justification: allows the user to keep track of the progress of the tasks added. 
  * Highlight: This implementation was challenging because there are no similar commands in the original AB3 to refer. New methods have to be created in the Index and 
  ParserUtil classes to parse the different index.
  
* **Feature**: Added the UI to display the tasklist in each tag. (Pull request [\#139](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/139))
  * What it does: allows the user to view the tasklist under each tag.
  * Justification: This feature allows the user to view the tasks under each tag.


#### Enhancements to Existing Features
* **Enhancement**: Wrote additional tests for existing features to increase coverage 
 (Pull requests [\#57](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/57), [\#70](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/70),
 [\#116](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/116), [\#120](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/120), 
 [\#138](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/138), [\#204](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/204), 
 [\#230](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/230))
 
#### Code Contributed
* [RepoSense link](https://nus-cs2103-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=siqiang-ng)

#### Project Management
* Wrapped up all milestones and managed releases `v1.2` - `v1.4` on GitHub
* Changed the product icon (Pull request [\#210](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/210))
* Maintained the issue tracker for `v1.2` - `v1.4`

#### Documentation    
* **User Guide**:
    * Documented `taglist`, `sort`, `tagsort`, `taskdone`, `linkdelete` features
    (Pull requests [\#116](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/116), 
    [\#120](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/120), [\#138](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/138),
    [\#139](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/139))
    * Edited documentation for `find` and `delete` commands (Pull request [\#235](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/235))
    * Updated the FAQ section (Pull request [\#215](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/215))
* **Developer Guide**:
    * Created the Table of Contents (Pull request [\#76](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/76))
    * Added the use case for creating a tag (Pull request [\#19](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/19))
    * Wrote the Product Scope & User Stories (Pull request [\#19](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/19), 
    [\#133](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/133))
    * Added implementations and the UML diagrams of `taglist`, `sort`, `tagsort`, `taskdone`, `linkdelete`
    (Pull requests [\#98](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/98), [\#116](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/116),
     [\#120](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/120), [\#138](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/138),
     [\#139](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/139))

#### Community    
* PRs reviewed (with non-trivial comments): [\#118](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/118), 
[\#145](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/145), [\#219](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/219), 
[\#222](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/222), [\#240](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/240),
[\#241](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/241)



