public class Test {

  public void myTest() {

    string name1="ABC";
    string name2="CDE";
    string name3="GFH";
    string name4="ABC";  //violation
    /*more useful in a long 
    list of names to find r repetition*/

    string r="A"+"B"+"C";   //no violation 

    string x=", ";
    string y=", ";    
    /*no violation since comma(followed by a space) is ignored while
    checking for repetitions*/

    string z=". ";
    string h=". ";
    /*no violation since dot(followed by a space) is ignored while
    checking for repetitions*/

    /*
    value='^((". ")|(", "))$'/>
    */
    int y1=1;
    if(y1)
    {
      string d="Hello";
    }
    if(y1)
    {
      string d1="Hello";
    }               
    /*no violation because of the keyword LITERAL_IF which ignores the duplicates in if statements*/


  }

}
