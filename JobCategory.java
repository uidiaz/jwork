/**
 * Write a description of class JobCategory here.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 18 Maret 2021
 */

 public enum JobCategory{
        WebDeveloper{
                @Override
                public String toString()
                {
                        return "Web Developer";
                }
        },
        
        FrontEnd{
                @Override
                public String toString()
                {
                        return "Front End";
                }
        },
        BackEnd{
                @Override
                public String toString()
                {
                        return "Back End";
                }
        },
        UI{
                @Override
                public String toString()
                {
                        return "UI";
                }
        },
        UX{
                @Override
                public String toString()
                {
                        return "UX";
                }
        },
        Devops{
                @Override
                public String toString()
                {
                        return "Devops";
                }
        },
        DataScientist{
                @Override
                public String toString()
                {
                        return "Data Scientist";
                }
        },
        DataAnalyst{
                @Override
                public String toString()
                {
                        return "Data Analyst";
                }
        };
        
        public static void main(String[] args)
        {
                System.out.println(JobCategory.WebDeveloper);
                System.out.println(JobCategory.FrontEnd);
                System.out.println(JobCategory.BackEnd);
                System.out.println(JobCategory.UI);
                System.out.println(JobCategory.UX);
                System.out.println(JobCategory.Devops);
                System.out.println(JobCategory.DataScientist);
                System.out.println(JobCategory.DataAnalyst);
        }
}