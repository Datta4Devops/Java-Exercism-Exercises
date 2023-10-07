public class Twofer {
    public String twofer(String name) {
        String answer;
        if (name!=null && name!=" " && name!="")
        {
            answer = "One for "+name+", one for me.";
        }
        else{
            answer = "One for you, one for me.";
        }
        return answer;
    }
}
