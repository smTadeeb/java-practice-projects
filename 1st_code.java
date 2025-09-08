class Bulb
{
    private int w;
    public void setWattage(int e)
    {
        w=e;
    }
    public int getWattage()
    {
        return w;
    }
}
class p2p {
    public static void main(String[] args) {
        Bulb m;
        m=new Bulb();
        //m=null;
        System.out.println("Before");
        m.setWattage(50);
        System.out.println("After");
        System.out.println(m.getWattage());
    }
}
