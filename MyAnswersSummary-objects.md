# Answers Summary

## Questions to Answer
Please answer the following 4 questions for each unit test:
1. What is the knowledge point of the test? Where is the official document to the knowledge point?
2. Why the test failed at first?
3. Why you corrected the test that way?
4. Do you have further questions on this knowledge point?

## ExceptionTest

#### should_be_careful_of_the_order_of_finally_block
1. Familiarity with usage of try and finally block
https://www.javaworld.com/article/2077609/try-finally-clauses-defined-and-demonstrated.html 
2. It failed at first because the initial value is already out of scope compared to what's inside of confuse method.
3. Corrected it by evaluating confuse method and correct the expected result variable.
4. None.

#### should_use_the_try_pattern
1. Utilization of Optional, Try/Catch/Finally just like from the previous activities.
https://www.baeldung.com/java-optional
2. It failed at first because the initial value of expected is empty.
3. Corrected it by evaluating ClosableStateReference and MyClosableType methods and correct the expected result variable.
4. None.

#### should_call_closing_even_if_exception_throws
1. More familiarization of Try/Catch
2. It failed at first because the initial value of expected is empty.
3. Corrected it by evaluating ClosableWithException and ClosableWithoutException methods and correct the expected result variable.
4. I am quite confused regarding on why the ClosableWithException came first instead of ClosableWithoutException.
Because I was expecting to be ClosableWithoutException will be the first.

#### For: should_call_closing_even_if_exception_throws
- Has been corrected in StackFrameHelper Class




#### For: should_customize_exception & should_customize_exception_continued
- Has been corrected in StringFormatException Class

## StringFormatException
####StringFormatException Constructors
1. This is for me to learn more on using Super keyword.
https://www.javatpoint.com/super-keyword
2. It failed at first because there was no implementation;
3. Corrected it by using Super keyword to pass the message in the parent Exception class.
4. None.

## StackFrameHelper
####getCurrentMethodName
1. Learned more about getting the class or method name through the StackTrace
https://www.tutorialspoint.com/java/lang/stacktraceelement_getmethodname.htm
https://www.tutorialspoint.com/java/lang/stacktraceelement_getclassname.htm
2. It failed at first because there was no implementation;
3. Corrected it by using Thread class to get the stack trace and change the index to locate the correct class name and method name.
4. Maybe more on discussion with this in ITA since it is helpful.


## InheritanceTest

#### should_be_derived_from_object_class
1. Familiarity in Super classes in Java
https://www.javatpoint.com/object-class
2. It failed at first because the expected value is null.
3. Corrected it by directly assigning Object class to expected value since it is the super class of all classes.
4. None.

#### should_call_super_class_constructor
1. More learnings on Java Inheritance, calling superclasses
http://journals.ecs.soton.ac.uk/java/tutorial/java/javaOO/subclasses.html
2. It failed at first because the expected value is empty.
3. Corrected it by evaluating DerivedFromSuperClassWithDefaultConstructor and parent SuperClassWithDefaultConstructor. Have checked it because the values of logs will come from there.
4. None.

#### should_call_super_class_constructor_continued
1. More learnings on Java Inheritance, calling superclasses, also using the this keyword
http://journals.ecs.soton.ac.uk/java/tutorial/java/javaOO/subclasses.html
https://www.javatpoint.com/this-keyword
2. It failed at first because the expected value is empty.
3. Corrected it by evaluating DerivedFromSuperClassWithDefaultConstructor with Int argument and parent SuperClassWithDefaultConstructor with Int Argument. Have checked it because the values of logs will come from there.
4. None.

#### should_call_super_class_constructor_more
1. More learnings on Java Inheritance, calling superclasses
http://journals.ecs.soton.ac.uk/java/tutorial/java/javaOO/subclasses.html
2. It failed at first because the expected value is empty.
3. Corrected it by evaluating DerivedFromSuperClassWithDefaultConstructor with String argument and parent SuperClassWithDefaultConstructor with String argument. Have checked it because the values of logs will come from there.
4. None.

#### should_call_most_derived_methods
1. For me to learn more on using and purpose of @Override function
https://www.baeldung.com/java-override
2. It failed at first because the expected name is null.
3. Corrected it by evaluating DerivedFromBaseClassForOverriding. Have checked it because the values that comes from there.
4. None.

#### should_call_super_class_methods
1. For me to learn more on using and purpose of @Override function and using of super keyword same as previous tests.
https://www.baeldung.com/java-override
2. It failed at first because the expected name is null.
3. Corrected it by evaluating DerivedFromBaseClassForOverridingCallingSuper and BaseClassForOverriding. Have checked it because the values that comes from there.
4. None.

#### should_use_caution_when_dealing_with_array_type
1. This is regarding with typecasting
2. It failed at first because the expected optional value is empty.
3. Corrected it by assigining a true value.
4. I just find it quite hard to evaluate the try block because it is quite hard to visualize.

#### should_not_make_you_confused
1. This is about inexplicit type casting.
https://www.studytonight.com/java/type-casting-in-java.php
2. It failed at first because the expected value is null.
3. Corrected it by assigining value that came from NestedDerivedClassWithName.
4. None.

#### should_not_make_you_confused_2
1. This is about getting values from the super class.
2. It failed at first because the expected value is null.
3. Corrected it by assigining value that came from super class BaseClassWithName because this was only being extended by DerivedFromBaseClassWithName.
4. None.

#### should_use_instance_of_to_determine_inheritance_relationship
1. This is about learning more on using instanceOf to evaluate objects.
https://www.javatpoint.com/downcasting-with-instanceof-operator
2. It failed at first because the Optional values are empty.
3. Corrected it by evaluating if nested is an instance of classes NestedDerivedClassWithName, DerivedFromBaseClassWithName, andBaseClassWithName
4. None.

#### should_use_instance_of_only_in_inheritance_relationship
1. This is about learning more on using instanceOf to evaluate objects.
https://www.javatpoint.com/downcasting-with-instanceof-operator
2. It failed at first because the Optional values are empty.
3. Corrected it by evaluating if integer is an instance of classe Integer, and since Long is not referenced, it is false.
4. None.

#### should_write_perfect_equals_1 (PersonForEquals)
#### should_write_perfect_equals_2 (PersonForEquals)
#### should_write_perfect_equals_3 (PersonForEquals)
#### should_write_perfect_equals_4 (PersonForEquals)
#### should_write_perfect_equals_5 (PersonForEquals)
#### should_write_perfect_equals_6 (PersonForEquals)
#### should_write_perfect_equals_7 (PersonForEquals)

## PersonForEquals

#### equals
1. This more on application of typecasting, also evaluating objects, also checking and getting class
2. It failed at first because there was no implementation;
3. Supplementing the method with correct checking of inputs when it is being called by other tests.
Also used typecasting in order to get name and yearbirth from PersonForEquals constructor that assigns the value into it.
4. None.

#### hashCode
1. Utilization of methods under Object class.
https://docs.oracle.com/javase/8/docs/api/java/util/Objects.html#hash-java.lang.Object...-
2. It failed at first because there was no implementation;
3. Corrected it by using Object.hash for name and yearbirth
4. None.

## ObjectTest

#### should_point_to_the_same_object
1. This knowledge point uses application of typecasting
2. It failed at first because the expected value is at empty;
3. Supplementing the expected method to true because it is now referencing to same object.
4. None.

#### should_point_to_different_object
1. This knowledge point is application if objects do not type cast.
2. It failed at first because the expected value is at empty;
3. Supplementing the expected method to false because though they have same values they are not related since there is no reference.
4. None.

#### should_initialized_to_default_value
1. This knowledge point is evaluating on what is the default value when nothing is passed in object.
2. It failed at first because the expected value written is not correct as is not being passed.
3. Supplementing the expected with the default values according to data type.
4. None.

#### should_pass_by_value
1. This knowledge point is passing parameters.
2. It failed at first because the expected value is 0;
3. Supplementing the value with 5 because though the method is called, it was not really returned so per my understanding it will not result to 7.
4. None.

#### should_pass_by_value_continued
1. This knowledge point is about referencing objects.
2. It failed at first because the expected value is null;
3. Supplementing the value with sameReference because objectReference was assigned to that.
4. None.

#### should_modify_internal_state
1. This knowledge point is about overriding values internally as well as passing parameters
2. It failed at first because the expected value is null;
3. Supplementing the value with "Updated Name" because it was initially "Initial Name" but when tryingToUpdateState was called and passed the value, it changed the name to "Updated Name"
4. None.

#### should_choose_method_at_compile_time
1. This knowledge point is about passing parameters and constructor overloading
https://beginnersbook.com/2013/05/constructor-overloading/
2. It failed at first because the expected value is null;
3. Supplementing the value with methodWithOneParameter(Object) since the value was passed is intially a String but typecasted with an object.
4. None.

#### should_choose_the_most_specific_overload
1. This knowledge point is about passing parameters and constructor overloading
https://beginnersbook.com/2013/05/constructor-overloading/
2. It failed at first because the expected value is null;
3. Supplementing the value with methodWithTwoParameters(String, Integer) since the value was passed is an string and integer.
4. None.

#### should_calling_another_constructor
1. This knowledge point is about constructor overloading
https://beginnersbook.com/2013/05/constructor-overloading/
2. It failed at first because the expected value is null;
3. Supplementing the expected value with Untitled since none was passed and default constructor has "Untitled" value.
4. None.

#### should_get_initialization_ordering
1. This knowledge point is about initialization, using of this keyword and constructor overloading
2. It failed at first because the expected value is empty;
3. Evaluating and supplementing the expected value in InitializationOrderClass.
4. None.

#### should_get_message_of_var_length_parameters
1. This knowledge point is about passing parameters, string builders
2. It failed at first because the expected value is null;
3. Evaluating getMessageOfVarLengthParameters and supplementing the expected value with appended escaped character \n.
4. None.

#### should_get_message_of_var_length_parameters_2
1. This knowledge point is about passing parameters, string builders
2. It failed at first because the expected value is null;
3. Evaluating getMessageOfVarLengthParameters and supplementing the expected value with appended escaped character \n. Same as above.
4. None.

