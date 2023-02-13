        String longer="";
        String smaller="";
        int s1=input1.length();
        int s2=input2.length();
        String output1="";
        if(s1==s2){
            if(input1.compareTo(input2)>0){
                longer=input2;
                smaller=input1;

            }
            else{
                longer=input1;
                smaller=input2;
            }
        }
        else if(s1>s2){
            longer=input2;
            smaller=input1;
        }
        else{
            longer=input1;
            smaller=input2;
        }
        String pin=input3+"";
       
        String output=longer.charAt(longer.length()-1)+smaller+pin.charAt(input4-1)+pin.charAt(pin.length()-input4);
        for(int i=0;i<output.length();i++){
            if(Character.isUpperCase(output.charAt(i))){
                output1+=Character.toLowerCase(output.charAt(i));
            }
            else if(Character.isLowerCase(output.charAt(i))){
                output1+=Character.toUpperCase(output.charAt(i));
            }
            else{
                output1+=output.charAt(i);
            }
        }
        return output1;
    }
}
