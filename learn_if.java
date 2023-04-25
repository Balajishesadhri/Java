class learn_if{

public static void main(String[] args){
learn_if li = new learn_if();

 li.find_higher_score(90,95);
}
void find_higher_score(int vk, int msd){


if(vk>msd){
System.out.println(vk);
}else if (vk<msd){
System.out.println(msd);
}else{
System.out.println(vk+msd);
}
}

}
