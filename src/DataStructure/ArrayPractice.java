package DataStructure;

public class ArrayPractice {
    public static void main(String[] args) {
        // 다차원 배열
        int[][][] array3 = {
                {
                        {1,2,3,},
                        {4,5,6}
                },
                {
                        {7,8,9,10}
                }
        };
        System.out.println(array3[0][1][2]); // 6
        System.out.println(array3[1][0][0]);//7
        System.out.println("= = = = = = = = = = = = ");

        // 문자열
        String dataset[] = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio",
                "mimi"
        };

        int count = 0;
        int cnt = 0;
        for(String value : dataset){
            if(value.indexOf("M") >= 0){ // 있으면 index ,없으면 -1 리턴
                count++;
            }
            if(value.contains("M")){ // 있으면 true, 없으면 false
                cnt++;
            }
        }
        System.out.println(count);
        System.out.println(cnt);


    }
}
