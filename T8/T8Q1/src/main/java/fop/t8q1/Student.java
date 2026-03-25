package fop.t8q1;

public class Student {                      //task a
    private String contactNum;                //task b
    public Student(){                         //task c
        contactNum=null;
    }
    public Student(String a){                 //task d
        contactNum=a;
    }
    public String getContactNum(){          //task e
        return contactNum;
    }
    public void setContactNum(String a){    //task e
        contactNum=a;
    }
    void displayContactNum(){               //task f
        System.out.println("The Contact Number is "+contactNum);
    }
}
