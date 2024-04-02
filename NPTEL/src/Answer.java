class Answer
{
    public static void main(String[] args)
    {
        Answer object=new Answer();
        //object.answer();
        //Question214 obj=new Question214();

    }
    Answer()
    {
        System.out.println("You got nothing.");
    }
    Answer(int marks, String type){
        System.out.print("You got "+marks+" for an "+ type);
    }
}
