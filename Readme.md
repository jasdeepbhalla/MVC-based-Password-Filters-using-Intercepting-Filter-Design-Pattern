Instructions

* My MVC Application uses Swings to create GUI. To execute the application run the main class of this application called 'mainClass' located in package 'MVC_Classes'. 
* MVC classes are in package 'MVC_Classes' and all intercepting design filter classes are in package called 'InterceptingFilter_Classes'.
* The application assumes that the user will select different and unique drop down options.
* The password field (from swing library) is used to take input so the input text is bullets (hidden like a password) and not text.
* The 'check Password' button checks for three types of filters in the order they are assigned. Order is specified by taking 1, 2 or 3 in the drop down menu.
* The filters used are: 

 (a) Offensive Filter: It has a list of strings => "abc", "def", "ghi". So this list of strings are considered as the offensive words. If the input is offensive it will be filtered.
 
 (b)	EasyPasswordFilter: It has a list of strings => "Disney", "Mickey", "Donald". The application filters easy passwords based on this list.
 
 (c) SaltingFilter: Salting filter will add salt string which is "salt12345" at the end of the given password.
* The output is checked for empty input and same drop down options.
* The output is displayed right below the 'check Password' submit button after you click the button. 
* The Output shows the given password and if it is valid or invalid. 

