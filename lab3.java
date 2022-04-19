import java.util.*;

public class lab3 {

    // Exception
    public static double divideDigits(double digit1, double digit2) throws myException {
        if(digit2 == 0)
            throw new myException("You cant divide by zero");
        return digit1 / digit2;
    }
    //Task1
    public static void bubbleSort(double arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static void printArray(double arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Collections 3
    public static Map<Character, Integer> count(String task3)
    {
        HashMap<Character, Integer> myMap = new HashMap<>();

        for(int i = 1; i < task3.length(); i++)
        {
            if(task3.charAt(i-1) == ' ')
            {
                char currentChar = task3.charAt(i);
                if(!myMap.containsKey(currentChar))
                    myMap.put(currentChar, 1);
                else
                {
                    int newValue = myMap.get(currentChar);
                    myMap.replace(currentChar, ++newValue);
                }
            }
        }

        char currentChar = task3.charAt(0);
        if(!myMap.containsKey(currentChar))
            myMap.put(currentChar, 1);
        else
        {
            int newValue = myMap.get(currentChar);
            myMap.replace(currentChar, ++newValue);
        }
        return myMap;
    }

    //Collections 2:
    public static ArrayList<ArrayList<Integer>> createMatrix()
    {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < 5; i++)
        {
            ArrayList<Integer> tmp = new ArrayList<>();
            matrix.add(tmp);
            for(int j = 0; j < 4; j++)
            {
                matrix.get(i).add(1 + (int)(Math.random() * 5));
            }
        }
        return matrix;
    }
    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix)
    {
        for(int i = 0; i < matrix.size(); i++)
        {
            System.out.println(matrix.get(i));
        }
    }
    public static void printReverseMatrix(ArrayList<ArrayList<Integer>> matrix)
    {
        for(int i = 0; i < matrix.size(); i++)
        {
            for(int j = matrix.get(i).size()-1; j >= 0; j--)
                System.out.print(matrix.get(i).get(j));
            System.out.println();
        }

    }
    public static ArrayList<ArrayList<Integer>> uniqueOnly(ArrayList<ArrayList<Integer>> matrix)
    {
        for(int i = 0; i < matrix.size(); i++)
        {
            ArrayList<Integer> tmp;
            LinkedHashSet<Integer> hashSet;
            for(int j = 0; j < matrix.get(i).size(); j++)
            {
                tmp = new ArrayList<>(matrix.get(i));
                hashSet = new LinkedHashSet<>(tmp);
                tmp = new ArrayList<>(hashSet);
                matrix.set(i,tmp);
            }

        }
        return matrix;

    }

    public static void main(String[] args) throws myException {
        //Task1
        System.out.println("Task1: ");
        double arr[] = {5, 9, 3, 2, 0, -4, -8.3, 3, -4};
        bubbleSort(arr);
        System.out.println(arr[arr.length-1]);
        System.out.println("Task2: ");

        //Task2
        double arr2[]= {1, 3, 6, 3, 4, 5, 5, 6, 0};
        bubbleSort(arr2);
        for(int i = 0; i < arr2.length-1; i++)
        {

            if(arr2[i] != arr2[i+1])
                System.out.print(arr2[i] + " ");

        }
        System.out.println(arr2[arr2.length-1]);


        //Task3 + task4
        System.out.println("Task3 + Task4: ");
        String strArray[] = {"12", "23", "34", "replaced", "56", "67"};
        for(int i = 0 ; i < strArray.length; i++)
        {
            if(strArray[i].equals("12"))
                strArray[i] = "replaced";
            System.out.print(strArray[strArray.length-1-i] + " ");
        }

        //Collections Task3
        System.out.println("Collections 3: ");
        Map<Character, Integer> myMap = count("Lomography is the commercial trademark of Lomographische AG, Austria for products and services catering to lo-fi photographers. The name is inspired by the former state-run optics manufacturer LOMO PLC of Saint Petersburg, Russia. LOMO PLC created and produced the 35mm LOMO LC-A Compact Automat camera — which became the centerpiece of Lomography’s marketing and sales activities. This camera was loosely based upon the Cosina CX-1 and introduced in the early 1980s. In 1991, the Austrian founders of Lomography discovered the Lomo LC-A. They were “charmed by the unique, colorful, and sometimes blurry” images that the camera produced. After a series of international art exhibitions and marketing, Lomography signed an exclusive distribution agreement with LOMO PLC — thereby becoming the sole distributor of all Lomo LC-A cameras outside of the Soviet Union. Since the introduction of the original Lomo LC-A, Lomography has produced and marketed various lines of branded analogue cameras. Most of these cameras are designed to produce a single photographic effect. In 2005, production of the original Lomo LC-A was discontinued. Its replacement, the LC-A+, was introduced in Fall 2006. The new camera, made in China rather than Russia, featured the original Russian lens manufactured by LOMO PLC. This changed as of mid-2007 with the lens now made in China as well. Similar to Eastman Kodak’s concept of the “Kodak moment”, the Lomography website endorses a motto of “Don’t Think, Just Shoot”. This motto is accompanied by the Ten Golden Rules of Lomography; guidelines encouraging spontaneity and minimal consideration of formal technique. The cameras marketed by Lomography are generally low-fidelity and inexpensively constructed. Some cameras make use of multiple lenses and colored flashes, or exhibit optical distortions and light leaks. Current models marketed by Lomographische AG include Lomo LC-A, Diana, Holga, Holga 35mm, Actionsampler, Frogeye, Pop-9, Oktomat, Fisheye, Fisheye2, Colorsplash, Colorsplash Flash, F-stop Bang, SuperSampler, Horizon 202, Seagull TLR, and Smena 8M. The company also resells dead stock Polaroid cameras and Russian dead stock. The Lomographic Society International owns galleries, stores and “showcases” dedicated to the growth, support and public exposure of the art. The society is based in Vienna, Austria, where most of its events are organised. An example of the society’s cultural events showcasing photographs from the community is the Lomokikuyu competition, which raises money for eye surgeries and vision care in Kenya, in partnership with Viennese vision aid organisation Light for the World. The project has since been updated and donations now also go to the International Committee of the Red Cross to help fight the famine in East Africa. The organisation also organises the Lomography World Congress, an international conference of practitioners held in varying host cities. The website also features a magazine, which provides a photo archive storage for their work. Articles monitor trends emerging in the community and offer tips on. Aficionados of the hobby can blog their own tutorials to share their discoveries, fostering enthusiasm with the Lomographic art. Besides fans who are community members, Lomo Amigos, or friends of Lomography, are often celebrities who enjoy working with Lomography cameras and are invited to contribute to the magazine. They include Elijah Wood, Neil Gaiman, and David Arquette. The site also celebrates the work of Lomographers with online exhibits and competitions. Digital painting is an emerging art form in which traditional painting techniques such as watercolor, oils, impasto, etc. are applied using digital tools by means of a computer, a digitizing tablet and stylus, and software. Traditional painting is painting with a physical medium as opposed to a more modern style like digital. Digital painting differs from other forms of digital art, particularly computer-generated art, in that it does not involve the computer rendering from a model. The artist uses painting techniques to create the digital painting directly on the computer. All digital painting programs try to mimic the use of physical media through various brushes and paint effects. Included in many programs are brushes that are digitally styled to represent the traditional style like oils, acrylics, pastels, charcoal, pen and even media such as airbrushing. There are also certain effects unique to each type of digital paint which portraying the realistic effects of say watercolor on a digital ‘watercolor’ painting. In most digital painting programs, the user can create their own brush style using a combination of texture and shape. This ability is very important in bridging the gap between traditional and digital painting. Digital painting thrives mostly in production art. It is most widely used in conceptual design for film, television and video games. Digital painting software such as Corel Painter, Adobe Photoshop, ArtRage, GIMP, Krita and openCanvas give artists a similar environment to a physical painter: a canvas, painting tools, mixing palettes, and a multitude of color options. There are various types of digital painting, including impressionism, realism, and watercolor. There are both benefits and drawbacks of digital painting. While digital painting allows the artist the ease of working in an organized, mess-free environment, some argue there will always be more control for an artist holding a physical brush in their hand. Some artists believe there is something missing from digital painting, such as the character that is unique to every physically made object. Many artist post blogs and comment on the various differences between digitally created work and traditionally created artwork. The main difference between digital and traditional painting is the non-linear process. That is, an artist can often arrange their painting in layers that can be edited independently. Also, the ability to undo and redo strokes frees the artist from a linear process. But digital painting is limited in how it employs the techniques and study of a traditional painter because of the surface differences and lack of physicality. The digital artist has at their disposal several tools not available to the traditional painter. Some of these include: a virtual palette consisting of millions of colors, almost any size canvas or media, and the ability to take back mistakes, as well as erasers, pencils, spray cans, brushes, combs, and a variety of 2D and 3D effect tools. A graphics tablet allows the artist to work with precise hand movements simulating a real pen and drawing surface. Even the traditional surface has changed for digital painting. Instead of a canvas or sketchbook, artists would use a mouse or tablet to display strokes that would appear with the touch of a pen to the tablet’s surface, or a click of pen. Tablets can be pressure sensitive, allowing the artist to vary the intensity of the chosen media on the screen. There are tablets with over two thousand different levels of pressure sensitivity. The earliest graphical manipulation program was called Sketchpad. Created in 1963 by Ivan Sutherland, a grad student at MIT, Sketchpad allowed the user to manipulate objects on a CRT (cathode ray tube). Sketchpad eventually led to the creation of the Rand Tablet for work on the GRAIL project in 1968, and the very first tablet was created. Other early tablets, or digitizers, like the ID (intelligent digitizer) and the BitPad were commercially successful and used in CAD (Computer Aided Design) programs. Modern day tablets are the tools of choice by digital painters. WACOM is the industry leader in tablets which can range in size from 4” x 6” all the way to 12” x 19” and are less than an inch thick. Other brands of graphic tablets are Aiptek, Monoprice, Hanvon, Genius, Adesso, Trust, Manhattan, Vistablet, DigiPro, etc. All these graphic tablets have the basic functions of a mouse, so they can be used as a mouse, not only in graphic editors but also as a replacement for a mouse, and they are compatible with practically all Windows and Macintosh software. The idea of using a tablet to communicate directions to a computer has been an idea since 1968 when the RAND (Research and Development) company out of Santa Monica, developed the RAND tablet that was used to program. Digitizers were popularized in the mid 1970s and early 1980s by the commercial success of the ID (Intelligent Digitizer) and BitPad manufactured by the Summagraphics Corp. These digitizers were used as the input device for many high-end CAD (Computer Aided Design) systems as well as bundled with PC’s and PC based CAD software like AutoCAD. The first commercial program that allowed users to design, draw, and manipulate object was the program MacPaint. This program’s first version was introduced on January 22, 1984 on the Apple Lisa. The ability to freehand draw and create graphics with this program made it the top program of its kind during 1984. The earlier versions of the program were called MacSketch and LisaSketch, and the last version of MacPaint was MacPaint 2.0 released in 1998. Much of MacPaint’s universal success was attributed to the release of the first Macintosh computer which was equipped with one other program called MacWrite. It was the first personal computer with a graphical user interface and lost much of the bulky size of its predecessor, the Lisa. The Macintosh was available at about $2500 and the combination of a smaller design made the computer a hit, exposing the average computer user to the graphical possibilities of the included MacPaint. Another early image manipulation program was Adobe Photoshop. It was first called Display and was created in 1987 by Thomas Knoll at the University of Michigan as monochrome picture display program. With help from his brother John, the program was turned into an image editing program called Imagepro, but later changed to Photoshop. The Knolls agreed on a deal with Adobe systems and Apple, and Photoshop 1.0 was released in 1991 for Macintosh. Adobe systems had previously release Adobe Illustrator 1.0 in 1986 on the Apple Macintosh. These two programs, Adobe Photoshop and Adobe Illustrator are currently two of the top programs used in the productions of digital paintings. Illustrator introduced the uses of Bezier curves which allowed the user to be incredibly detailed in their vector drawings. In 1988, Craig Hickman created a paint program called Kid Pix, which made it easier for children to use MacPaint. The program was originally created in black in white, and after several revisions was released in color in 1991. Kid Pix was one of the first commercial programs to integrate color and sound in a creative format. While the Kid Pix was intentionally created for children, it became a useful tool for introducing adults to the computer as well. In recent years there has been a growth in the websites which support painting digitally online. Internet resources for this include Sumo Paint and Queeky. The user is still drawing digitally with the use of software: often the software is on the server of the website which is being used. However with the emergence of html5, some programs now partly use the client’s web browser to handle some of the processing. The range of tools and brushes can be more limited than free standing software. Speed of response, quality of colour and the ability to save to a file or print are similar in either media. Digitally painted images allow the choice of viewing on screen, or simply printed on paper for display. Other benefits include. It has had a large impact on speed painting. Each stroke of the painting process can be captured for later replay and study. Tools and resources are easy to access on the internet, so that anyone can learn. It makes it easy to learn to paint and to progress to ‘real’ painting. Computer art is any art in which computers play a role in production or display of the artwork. Such art can be an image, sound, animation, video, CD-ROM, DVD-ROM, videogame, web site, algorithm, performance or gallery installation. Many traditional disciplines are now integrating digital technologies and, as a result, the lines between traditional works of art and new media works created using computers has been blurred. For instance, an artist may combine traditional painting with algorithm art and other digital techniques. As a result, defining computer art by its end product can thus be difficult. Computer art is by its nature evolutionary since changes in technology and software directly affect what is possible. Notable artists in this vein include James Faure Walker, Manfred Mohr, Ronald Davis, Joseph Nechvatal, Matthias Groebel, George Grie, Olga Kisseleva, John Lansdown, Perry Welman, and Jean-Pierre Hébert. By the mid-1960s, most individuals involved in the creation of computer art were in fact engineers and scientists because they had access to the only computing resources available at university scientific research labs. Many artists tentatively began to explore the emerging computing technology for use as a creative tool. In the summer of 1962, Dr. A. Michael Noll programmed a digital computer at Bell Telephone Laboratories in Murray Hill, New Jersey to generate visual patterns solely for artistic purposes . His later computer-generated patterns simulated paintings by Piet Mondrian and Bridget Riley and become classics. Noll also used the patterns to investigate aesthetic preferences in the mid 1960s. Computer art dates back to at least 1960, with the invention of the Henry Drawing Machine by Desmond Paul Henry. His work was shown at the Reid Gallery in London in 1962, after his machine-generated art won him the privilege of a one-man exhibition. In 1963 Joan Shogren of San Jose State University wrote a computer program based on artistic principles, resulting in an early public showing of computer art in San Jose, California on May 6, 1963. The first two exhibitions of computer art were held in 1965- Generative Computergrafik, February 1965, at the Technische Hochschule in Stuttgart, Germany, and Computer-Generated Pictures, April 1965, at the Howard Wise Gallery in New York. The Stuttgart exhibit featured work by Georg Nees; the New York exhibit featured work by Bela Julesz and A. Michael Noll. Note the names of these expositions, not mentioning the word ‘art’, because these ‘generated pictures’ were not yet seen as such. A third exhibition was put up in November 1965 at Galerie Wendelin Niedlich in Stuttgart, Germany, showing works by Frieder Nake and Georg Nees. In 1968, the Institute of Contemporary Arts (ICA) in London hosted one of the most influential early exhibitions of computer art- Cybernetic Serendipity. The exhibition included many of whom often regarded as the first true digital artists, Nam June Paik, Frieder Nake, Leslie Mezei, Georg Nees, A. Michael Noll, John Whitney, and Charles Csuri. One year later, the Computer Arts Society was founded, also in London. At the time of the opening of Cybernetic Serendipity, in August 1968, a symposium was held in Zagreb, Yugoslavia, under the title “Computers and visual research”. It took up the European artists movement of New Tendencies that had led to three exhibitions (in 1961, 63, and 65) in Zagreb of concrete, kinetic, and constructive art as well as op art and conceptual art. New Tendencies changed its name to “Tendencies” and continued with more symposia, exhibitions, a competition, and an international journal (bit international) until 1973. Katherine Nash and Richard Williams published Computer Program for Artists: ART 1 in 1970. Xerox Corporation’s Palo Alto Research Center (PARC) designed the first Graphical User Interface (GUI) in the 1970s. The first Macintosh computer is released in 1984, since then the GUI became popular. Many graphic designers quickly accepted its capacity as a creative tool. Formerly, technology restricted output and print results: early machines used pen-and-ink plotters to produce basic hard copy. In the 1970s, the dot matrix printer (which was much like a typewriter) was used to reproduce varied fonts and arbitrary graphics. The first animations were created by plotting all still frames sequentially on a stack of paper, with motion transfer to 16-mm film for projection. During the 1970s and 1980s, dot matrix printers were used to produce most visual output while microfilm plotters were used for most early animation. In 1976, the inkjet printer was invented with the increase in use of personal computers. The inkjet printer is now the cheapest and most versatile option for everyday digital color output. RasterImage Processing (RIP) is typically built into the printer or supplied as a software package for the computer; it is required to achieve the highest quality output. Basic inkjet devices do not feature RIP. Instead, they rely on graphic software to rasterize images. The laser printer, though more expensive than the inkjet, is another affordable output device available today. Adobe Systems, founded in 1982, developed the PostScript language and digital fonts, making drawing painting and image manipulation software popular. Adobe Illustrator, a vector drawing program based on the Bézier curve introduced in 1987 and Adobe Photoshop, written by brothers Thomas and John Knoll in 1990 were developed for use on MacIntosh computers and compiled for DOS/Windows platforms by 1993. Street art is art, specifically visual art, developed in public spaces — that is, “in the streets” — though the term usually refers to unsanctioned art, as opposed to government sponsored initiatives. The term can include traditional graffiti artwork, sculpture, stencil graffiti, sticker art, wheatpasting and street poster art, video projection, art intervention, guerrilla art, flash mobbing and street installations. Typically, the term street art or the more specific post-graffiti is used to distinguish contemporary public-space artwork from territorial graffiti, vandalism, and corporate art. Artists have challenged art by situating it in non-art contexts. ‘Street’ artists do not aspire to change the definition of an artwork, but rather to question the existing environment with its own language. They attempt to have their work communicate with everyday people about socially relevant themes in ways that are informed by esthetic values without being imprisoned by them. John Fekner defines street art as “all art on the street that’s not graffiti.” Whereas traditional graffiti artists have primarily used free-hand aerosol paints to produce their works, “street art” encompasses many other media and techniques, including: LED art, mosaic tiling, murals, stencil art, sticker art, street installations, wheatpasting, woodblocking, video projection, and yarn bombing. Traditional graffiti also has increasingly been adopted as a method for advertising; its trajectory has even in some cases led its artists to work on contract as graphic artists for corporations. Nevertheless, street art is a label often adopted by artists who wish to keep their work unaffiliated and strongly political. Street artists are those whose work is still largely done without official approval in public areas. For these reasons street art is sometimes considered “post-graffiti” and sometimes even “neo-graffiti.” Street art can be found around the world and street artists often travel to other countries foreign to them so they can spread their designs. The motivations and objectives that drive street artists are as varied as the artists themselves. There is a strong current of activism and subversion in urban art. Street art can be a powerful platform for reaching the public, and frequent themes include adbusting, subvertising and other culture jamming, the abolishment of private property and reclaiming the streets. Some street artists use “smart vandalism” as a way to raise awareness of social and political issues. Other street artists simply see urban space as an untapped format for personal artwork, while others may appreciate the challenges and risks that are associated with installing illicit artwork in public places. However the universal theme in most, if not all street art, is that adapting visual artwork into a format which utilizes public space, allows artists who may otherwise feel disenfranchised, to reach a much broader audience than traditional artwork and galleries normally allow. Street artists such as Above, Jef Aérosol, Banksy, Borf, Dillon Boy, Mat Benote, BLU, Cartrain, Ces53, Dan Witz, D*Face, Tod Hanson, Invader, Michael Kirby, Neck Face, Ellis Gallagher, Vhils, Os Gemeos, Swoon, Twist, 108 and Sten Lex, have earned international attention for their work and have shown their works in museums or galleries as well as on the street. It is also not uncommon for street artists to achieve commercial success (e.g., Ash, Shepard Fairey, Ron English, Faile, Mr. Brainwash and WK Interact), doing graphics for other companies or starting their own merchandising lines. Other pioneers of street art who have completely discontinued street art (e.g., Richard Hambleton and members of AVANT) have also successfully pursued their contemporary art careers in galleries and museums. In 1981, Washington Project for the Arts held an exhibition entitled Street Works, which included John Fekner, Fab Five Freddy and Lee Quinones working directly on the streets. Fekner, a pioneer in urban art, is included in Cedar Lewisohn’s book Street Art: The Graffiti Revolution, which accompanied the 2008 Street Art exhibition at the Tate Modern in England, of which Lewisohn was the curator. The 1990 book Soho Walls – Beyond Graffiti by David Robinson documents the paradigm shift in New York from the text-based precedents established by graffiti artists toward art in the streets such as the shadow figures by Richard Hambleton and the group of five young New York artists working collectively under the moniker AVANT. In 1993, 20 1-ton statues of a coated human-beast called my inner beast where eracted in different cities all over Europe, in order to provoke the average European into seeing their own inner beast. Later in the year Jens Galschiøt was first identified as the artist. While practically all large cities in the world, and some of the larger regional towns, host some form of urban art or graffiti, there are a few locations that are considered to harbour forerunners of particular mediums or foster a pioneering street art culture in general. Such locations often attract internationally known artists who travel to these locations to exhibit their works. The following is a partial list of the most notable locations. Bulgaria: Sofia – In the night between the 17th and the 18th of June 2011 the monument of the Soviet Army in Sofia was painted by anonymous street artists. The Soviet soldiers depicted in the monument for a few days turned into Superman, Ronald McDonald, Santa Claus and others. It was a controversial subject and there were many supporters of the monument staying painted and many against it. In the early morning of June 21, 2011 the monument was cleaned. Germany: Berlin has attracted attention to international urban artists since the reunification of the city, making it one of Europe’s street art strongholds. Bizarre post-communist locations, cheap rents and ramshackle buildings gave rise to a vibrant street art scene. Hotspots include Mitte, Prenzlauer Berg, Kreuzberg and Friedrichshain. Italy has been very active in street art since the end of the 90’s; some of the most famous street artists include BLU, 108, and Sten Lex. France: Paris is also a very active street art scene with artists such as Space Invader, Zevs, Mosko et Associés, Mesnager, Zoo Project. It started with the Lettrism and then with a Situationist slogan painted on a wall in Paris. The nouveau realist, including Jacques Villeglé, Yves Klein and Arman interact with public space but stay, like Pop Art in a classic studio/gallery relation. On 1962, The Rideau de Fer (Iron Curtain) By Christo and Jeanne-Claude is an example of early uncommissioned art. The Same year sees the first can spray work by pioneer Gérard Zlotykamien. After the “chienlit” (expression coined by General De Gaulle to qualify the May 1968 mini-revolution, Paris, like New-York has major city works but no Factory as important as Warhol’s. In the 1970s, the work of Daniel Buren appeared in the Paris subway. Blek le Rat and the Figuration Libre (including Claude Closky and Pierre Huyghe) became active in the 1980s. Norway: Stavanger is host to the annual Nuart Festival, one of Europe’s leading events dedicated to promoting street art. Poland: Łódź in September 2011, under the patronage of Mayor Hanna Zdanowska, a permanent city exhibition was financed called Urban Forms Gallery. The exhibition included work from some of Poland’s elite street artists as well as some more globally known artists. Since the 1990s street art has been prevalent in Poland, which is most likely related to the collapse of communism in 1989. Street art is largely, though not exclusively, inspired by the hip-hop music scene. It is mostly accepted by the public, with the authorities occasionally giving licence to artists to decorate public spots. Despite this, public property is still illegally targeted in some cases. Warsaw and Gdansk are among some of the other Polish cities with a vibrant street art culture. Spain: Major Spanish coastal cities such as Barcelona, Valencia and Zaragoza have a vibrant street art scene. UK: Bristol is part of a vibrant street art scene, due in part to the success of Banksy. London has become one of the most pro-graffiti cities in the world. Although officially condemned and heavily enforced, street art has a huge following and in many ways is embraced by the public. Atlanta: small but growing street art scene in the Krog Street Tunnel and the 22-mile BeltLine path which circles the inner city along industrial and residential spaces. Host of the Living Walls street art conference. However, in May 2011 Atlanta established a Graffiti Task Force. In October 2011 the police arrested 7 persons that they designated as vandals and some regard as artists. However, city officials assert that they have no intention of stifling the street art scene. The city selected 29 murals which would not be painted over including those commissioned as part of the BeltLine and works created during the Living Walls conferences. But the list did not include the most famous street art space in the city, the Krog Street Tunnel. Many street artists and members of the arts community interviewed by Creative Loafing believe the city’s efforts are misdirected or futile. Los Angeles: influential art and intriguing graffiti pieces throughout the city. Key locations include Sunset Boulevard, La Brea, Beverly Boulevard, La Cienega, Melrose Avenue, and Hollywood to name a few. On May 13, 2011, LAB ART Los Angeles opened the world’s largest art gallery dedicated to street art on La Brea. Spanning 6,500 square feet (600 m2) of space, features over 300 works of art and installation from over 30 street artists including Alec Monopoly, Thank You X and Smear. Miami’s Wynwood is home to Wynwood Walls, an outdoor mural permanent exhibit featuring some of the world’s most renowned street artists. Additionally there are hundreds of other street art and graffiti murals around the district curated yearly by Primary Flight, making it one of the biggest street art districts in in the world. Sarasota’s ‘Going Vertical’ launched in 2011 with artists participating from all over the world in Historic Burns Square. The event is curated and managed by the Sarasota Chalk Festival which also brought cellograff from France to the United States. In the early 1980s New York City hosted the first art galleries that showed street artists to the public. These were Fashion Moda in Bronx and Now Gallery in East Village, Manhattan. San Francisco’s Mission District is renowned for its densely-packed street art along Mission Street, and all along both Clarion Alley and Balmy Alley. Argentina: Buenos Aires has an active street art seen throughout the city. A fundamental difference with the scene in Buenos Aires is the implicit co-operation of the police, who rarely bother street artists. Some companies offer tours to explore the street art in the city and learn more about the artists and their work. Ever is a Buenos Aires artist whose work has gained an international recognition, including at the Living Walls conference. Brazil: São Paulo has an internationally recognized street art scene in addition to pichação, rune-like black graffiti which many creators say expresses feelings of class conflict. Melbourne is home to one of the world’s most active and diverse street art cultures and is home to pioneers in the stencil medium. Street artists such as Blek le Rat and Banksy often exhibited works on Melbourne’s streets in the 2000s. Works are supported and preserved by local councils. Key locations within the city include Brunswick, Carlton, Fitzroy, Northcote, and the city centre including the famous Hosier Lane.");
        System.out.println(myMap);

        //Collections Task1
        System.out.println("Collections 1: ");
        List<String> arrList = new ArrayList<>();
        arrList.add("E1");
        arrList.add("E3");
        arrList.add("E1");
        arrList.add("E3");
        arrList.add("E3");
        arrList.add("E1");
        arrList.add("E1");
        arrList.add("E1");
        arrList.add("E3");
        arrList.add("E1");
        arrList.add("E1");
        arrList.add("E2");
        arrList.add("E1");
        arrList.add("E2");
        arrList.add("E2");
        arrList.add("E1");
        arrList.add("E1");
        arrList.add("E1");
        arrList.add("E2");
        arrList.add("E1");

        for(int i = 0; i < arrList.size()/2; i++)
        {
            if(arrList.get(i).equals("E1"))
            {
                arrList.set(i, "E2");
            }

        }
        System.out.println(arrList);

        //Collections Task2
        System.out.println("Collections 2: ");
        ArrayList<ArrayList<Integer>> matrix = createMatrix();
        printMatrix(matrix);
        System.out.println("--------");
        printReverseMatrix(matrix);
        System.out.println("--------\n");
        printMatrix(uniqueOnly(matrix));





        //Exception
        System.out.println("Exception: ");
        divideDigits(1,1);
    }

}

class myException extends Exception
{
    public myException(String message) {
        super(message);
    }

}