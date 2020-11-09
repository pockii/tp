---
layout: page
title: Kyi Nuu Khin Khin's Project Portfolio Page
---

## Project: Projact

Projact is a **project management app that helps NUS computing students to organise their fellow computing students' contacts and their teams' meeting links and tasks**. It is optimized for use via a Command Line Interface (CLI) while still having the benefits of a Graphical User Interface (GUI).

Given below are my contributions to the project.

### New Features
  
* **Feature**: Added the ability to add tags.
  * What it does: allows the user to add a new tag with zero contacts in the tag. 
  * Justification: This feature allows for more flexibility of how the app is being used as users can create additional tags that may not necessarily be related to any contacts. A possible example might be the user having a `personal` tag, so that the user can add personal tasks and or meeting links to the task. 
  
* **Feature**: Added the ability to add tasks to tags.
  * What it does: allows the user to add tasks to tags one at a time.
  * Justification: This feature improves the product significantly because the functionality of tags has been greatly improved. Tags are now capable of storing more information, and tasks in particular can help the user be more organised.
  * Highlights: This enhancement was hard to implement as previous commands did not care about the previous entry, and merely overwrote them (such as tags being rewritten when user edits a contact). However for task related commands, it was necessary to retrieve the previous list of tasks, and this posed a challenge. We managed to solve this by introducing a new method that would work with the current implementation.

* **Feature**: Added the ability to delete tasks from tags.
  * What it does: allows the user to delete tasks from tags one at a time. This is done by using both the index of the tag and the index of the task.
  * Justification: This feature improves the product as the user can now delete tasks that they have either added accidentally or made a typo in.
  * Highlights: Similar to the above feature, we initially struggled with using the currently implemented model to add this new feature. However we managed to solve this by finding the exact task using an alphabetical index, making it easier to identify which index to delete.

### Enhancements to Existing Features
* **Enhancement**: Refactored the code to use terms specific to our app (Pull requests [\#53](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/53))
    * Justification: This improved readability of code for other developers, as our app was adapted from an app called "AddressBook", which might be confusing for new developers unaware of this.
* **Enhancement**: Fixed bug that resulted in text being cut off when it was longer than the result display box. (Pull requests [\#234](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/234))

### Code Contributed
* [RepoSense link](https://nus-cs2103-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=khinkhinn)

### Project Management
* Aided in maintenance of issue tracker during `v1.1`

### Documentation    
* **User Guide**:
    * Added documentation for `tagedit`, `taskadd` and `taskdelete` features [\#29](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/29), [\#149](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/149)
* **Developer Guide**:
    * Added non-functional requirements [\#33](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/33)
    * Added implementation details of the `tagadd`, `taskadd` and `taskdelete` features [\#93](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/93), [\#250](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/250)
    * Formatted developer guide to ensure that there was a consistent format and style during `v1.3` [\#97](https://github.com/AY2021S1-CS2103T-T17-4/tp/pull/97)
