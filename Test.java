public class Test {

  public void myTest() {
      if(foo) {              // OK
          //...
      } else if(bar) {        // violation
          //...
      }

      testMethod(foo,bar);   // OK
      testMethod(foo,bar);    // violation

      for (;;){}               // OK
      for (;;){}                // violation, space after 'for' is required
  }

}
