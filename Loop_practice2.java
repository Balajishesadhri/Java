class Loop_practice2{
public static void main(String[] args){
Loop_practice2 li = new Loop_practice2();
int power=li.find_power(3,5);

System.out.print(power);

}
int find_power(int base,int power){
int box=1;
while(power>0){
box= box*base;
power=power-1;

}

return(box);
}


}
