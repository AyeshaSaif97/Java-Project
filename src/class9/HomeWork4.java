package class9;

public class HomeWork4 {
    public static void main(String[] args) {
        /*
        Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        Then print all values from that array using 2 different loops and calculate how many total countries been stored.
         */
        String[][] countries =
                {{"United States", "Canada", "Mexico", "Guatemala",
                        "Haiti", "Dominican Republic", "Cuba", "Honduras", "Nicaragua",
                        "El Salvador", "Costa Rica", "Panama", "Puerto Rico", "Jamaica",
                        "Trinidad and Tobago", "Bahamas", "Belize", "Guadeloupe", "Martinique",
                        "Barbados", "Curaçao", "Saint Lucia", "Grenada", "Aruba",
                        "Saint Vincent and the Grenadines", "United States Virgin Islands",
                        "Antigua and Barbuda", "Dominica", "Cayman Islands", "Bermuda", "Greenland",
                        "Saint Kitts and Nevis", "Turks and Caicos Islands", "Sint Maarten",
                        "Saint Martin", "British Virgin Islands", "Caribbean Netherlands", "Anguilla",
                        "Saint Barthélemy", "Saint Pierre and Miquelon", "Montserrat"},

                        {"Brazil", "Colombia", "Argentina", "Peru", "Venezuela", "Chile", "Ecuador", "Bolivia", "Paraguay", "Uruguay", "Guyana", "Suriname", "French Guiana", "Falkland Islands"},

                        {"Russia", "Germany", "United Kingdom", "France", "Italy", "Spain",
                                "Poland", "Ukraine", "Romania", "Netherlands", "Belgium", "Sweden",
                                "Czechia", "Greece", "Portugal", "Hungary", "Belarus", "Austria",
                                "Switzerland", "Serbia", "Bulgaria", "Denmark", "Slovakia", "Finland",
                                "Norway", "Ireland", "Croatia", "Moldova", "Bosnia and Herzegovina",
                                "Albania", "Lithuania", "Slovenia", "North Macedonia", "Latvia",
                                "Estonia", "Luxembourg", "Montenegro", "Malta", "Iceland", "Isle of Man",
                                "Andorra", "Faeroe Islands", "Liechtenstein", "Monaco", "San Marino",
                                "Gibraltar", "Holy See"},

                        {"India", "China", "Indonesia", "Pakistan", "Bangladesh", "Japan",
                                "Philippines", "Vietnam", "Iran", "Turkey", "Thailand", "Myanmar",
                                "South Korea", "Iraq", "Afghanistan", "Saudi Arabia", "Uzbekistan",
                                "Yemen", "Malaysia", "Nepal", "North Korea", "Taiwan", "Syria", "Sri Lanka",
                                "Kazakhstan", "Cambodia", "Jordan", "Azerbaijan", "Tajikistan", "Israel",
                                "United Arab Emirates", "Laos", "Hong Kong", "Kyrgyzstan", "Turkmenistan",
                                "Singapore", "State of Palestine", "Lebanon", "Oman", "Kuwait", "Georgia",
                                "Mongolia", "Armenia", "Qatar", "Bahrain", "Timor-Leste", "Cyprus", "Bhutan",
                                "Macao", "Maldives", "Brunei Darussalam"},


                        {"Nigeria", "Ethiopia", "Egypt", "Democratic Republic of the Congo",
                                "Tanzania", "South Africa", "Kenya", "Uganda", "Sudan", "Algeria",
                                "Morocco", "Angola", "Ghana", "Mozambique", "Madagascar",
                                "Côte d'Ivoire", "Cameroon", "Niger", "Mali", "Burkina Faso", "Malawi",
                                "Zambia", "Chad", "Somalia", "Senegal", "Zimbabwe", "Guinea", "Rwanda",
                                "Benin", "Burundi", "Tunisia", "South Sudan", "Togo", "Sierra Leone",
                                "Libya", "Congo", "Central African Republic", "Liberia", "Mauritania",
                                "Eritrea", "Gambia", "Botswana", "Namibia", "Gabon", "Lesotho",
                                "Guinea-Bissau", "Equatorial Guinea", "Mauritius", "Eswatini",
                                "Djibouti", "Réunion", "Comoros", "Cabo Verde", "Western Sahara",
                                "Mayotte", "Sao Tome and Principe", "Seychelles", "Saint Helena"},

                };
        for (String[] r : countries) {
            for (String c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println("===============================================");

        for (int i = 0; i < countries.length ; i++) {
            for (int j = 0; j <countries[i].length;j++){
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
      }

        System.out.println("===============================================");
        int total = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                total++;
            }
        }
        System.out.println("Total number of countries "+total);
    }
}






