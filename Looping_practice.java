class Looping_practice{

public static  void main(String[] args){

Looping_practice li = new Looping_practice();

li.print_reverse(9697);
li.count_of_digits(12345);



}
void print_reverse(int cake){

while(cake>0){
System.out.print(cake%10);
cake=cake/10;


}
System.out.println();
}

void count_of_digits(int cake){
int count=0;
while(cake>0){
count+=1;
System.out.println(cake%10);
cake=cake/10;


}
System.out.println("count"+count);

}
}
