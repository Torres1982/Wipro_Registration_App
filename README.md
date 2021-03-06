# Wipro Registration App

### Technologies used:
1. Android Studio
2. Java
3. XML

### Project Description:
Design simple registration screen which has First name, Last name, email id, date of birth, gender, address and sign-up button.
Please add validations to all field and on button click print all parameters - (use an *Activity* as well as *Fragment*).

### Future improvements based on the feedback:

#### A) First review/feedback (18th April 2019):
1. Replace the Linear Layout with Constraint Layout.                                  UPDATED
2. Move the validation methods to a Validation Utility Class.                         UPDATED
3. Add Second Activity and Activity Life Cycle overridden methods with log messages. UPDATED
4. Write Unit Tests for validation methods.                                           UPDATED
5. Improve the eircode validation.                                                    UPDATED
6. Add a validation for date of birth (assume, greater than 18).                      UPDATED
7. Include *Fragments*.                                                                NEEDS TO BE DONE !!!

Theory Questions:
1. Why do Android have multiple build.gradle files?                                   ANSWERED
2. The difference between a Simulator and Emulator in Android?                        ANSWERED
3. Accessing static and non-static methods.                                           ANSWERED
4. What is a Group Views in Constraint Layout?                                        ANSWERED
5. Does the Android device store all of the mipmap icons (all different resolutions)
   or it only keeps the ones that it supports?                                        ANSWERED
   
#### B) Second review/feedback (26th April 2019):
1. Remove hard-coded dimensions in xml file and replace them with the usage of *dimens.xml* resource file. UPDATED
2. Remove fixed measurements from layout heights and widths. Use *match_parent*, *wrap_content*, etc. UPDATED
3. Fix the issue with an *autofill hint*. UPDATED
4. *Radio Group* layout fixed (removed hard-coded margin and replaced with a dynamic layout gravity). UPDATED
5. Resolve the issue with horizontally placed Edit Text views within Constraint Layout, so they dynamically
occupy the whole parent's width with each having equal width. *CHAINING* applied! UPDATED

Theory Questions:
1. Why do we need *dimens.xml* resource file?                                          ANSWERED
2. Why do we need *Content Provider* if we can use own database?
3. What is static, dynamic and local *Broadcast Receiver*?                             ANSWERED
4. Types of *Services*, how to start a Service, and pass the data from Service to an Activity?  ANSWERED
