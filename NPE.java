//NullPointerException
class NPE {
    public static void main(String[] args) {
        String s = null;
        try {
            if(s.equals("gfg"))
            System.out.println("Same");
            else
            System.out.println("Not same");
        } catch(NullPointerException e) {
            System.out.println("Null Pointer exception caught");
        }
    }
}

//if("gfg".equals(s)) -> output will be not same