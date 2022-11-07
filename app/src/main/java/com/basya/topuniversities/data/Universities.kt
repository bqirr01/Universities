package com.basya.topuniversities.data

import com.basya.topuniversities.R


object Universities {
        private val universityNames = arrayOf(

            "University Islam of Medina",
            "Massachusetts Institute of Technology (MIT)",
            "University of Cambridge",
            "Stanford University",
            "University of Oxford",
            "Harvard University",
            "Koç University",
            "National University of Singapore (NUS)",
            "Kyoto University",
            "Gadjah Mada University",

            )
        private val universityAddress = arrayOf(
            "Medina, Saudi Arabia",
            "Massachusetts, United States",
            "Cambridge, England",
            "Stanford, California, United States",
            "Oxford, England",
            "Massachusetts, United States",
            "Sarıyer, Istanbul, Turkey",
            "Queenstown, Singapore",
            "Yoshida, Kyoto, Japan",
            "Jogjakarta, Indonesia",
        )
        private val universityDetail = arrayOf(
            "The Islamic University of Medina (Arabic: الجامعة الإسلامية بالمدينة المنورة) was founded by the government of Saudi Arabia by a royal decree in 1961 in the Islamic holy city of Medina.\n" +
                    "\n" +
                    "The Islamic University of Medina has a full scholarship program for Muslims around the world who intend to study majoring in Islamic religion such as the faculty of sharia, the Koran, hadith, Arabic and ushul al-din.\n" +
                    "\n" +
                    "Currently, there are more than 20,000 international students studying there. Every year around 100-150 Indonesian students are accepted and get full scholarships at the Islamic University of Medina.\n" +
                    "\n" +
                    "The scholarship includes a monthly stipend and a return ticket to Indonesia every year. This is one of the reasons and advantages of studying in Medina which is very attractive.",
            "The Massachusetts Institute of Technology (MIT) is a private land-grant research university in Cambridge, Massachusetts. Established in 1861, MIT has since played a key role in the development of modern technology and science, ranking it among the top academic institutions in the world.\n" +
                    "\n" +
                    "Founded in response to the increasing industrialization of the United States, MIT adopted a European polytechnic university model and stressed laboratory instruction in applied science and engineering. The institute has an urban campus that extends more than a mile (1.6 km) alongside the Charles River, and encompasses a number of major off-campus facilities such as the MIT Lincoln Laboratory, the Bates Center, and the Haystack Observatory, as well as affiliated laboratories such as the Broad and Whitehead Institutes.",
            "The University of Cambridge is a collegiate research university in Cambridge, United Kingdom. Founded in 1209[9] and granted a royal charter by Henry III in 1231, Cambridge is the world's third-oldest surviving university.\n" +
                    "\n" +
                    "Cambridge is ranked among the most prestigious universities in the world and currently sits as the world's second best university, and the best in Europe, according to the QS World University Rankings.[12] Cambridge has won more Nobel Prizes than any other institution, with 121 Nobel laureates. The university's notable alumni and faculty also include 11 Fields Medalists, 7 Turing Award winners, 47 heads of state and 14 British prime ministers. As of 2016, University alumni had won 194 Olympic medals.",
            "Stanford University, officially Leland Stanford Junior University, is a private research university in Stanford, California. The campus occupies 8,180 acres (3,310 hectares), among the largest in the United States, and enrolls over 17,000 students. Stanford is ranked among the top universities in the world.\n" +
                    "\n" +
                    "Stanford was founded in 1885 by Leland and Jane Stanford in memory of their only child, Leland Stanford Jr., who had died of typhoid fever at age 15 the previous year. Leland Stanford was a U.S. senator and former governor of California who made his fortune as a railroad tycoon.",
            "The University of Oxford is a collegiate research university in Oxford, England. There is evidence of teaching as early as 1096, making it the oldest university in the English-speaking world and the world's second-oldest university in continuous operation.\n" +
                    "\n" +
                    " It grew rapidly from 1167 when Henry II banned English students from attending the University of Paris.[2] After disputes between students and Oxford townsfolk in 1209, some academics fled north-east to Cambridge where they established what became the University of Cambridge.[12] The two English ancient universities share many common features and are jointly referred to as Oxbridge. Oxford is ranked among the most prestigious universities in the world.\n" +
                    "\n" +
                    "The university is made up of thirty-nine semi-autonomous constituent colleges, six permanent private halls, and a range of academic departments which are organised into four divisions.[14] All the colleges are self-governing institutions within the university, each controlling its own membership and with its own internal structure and activities. ",
            "Harvard University is a private Ivy League research university in Cambridge, Massachusetts. Founded in 1636 as Harvard College and named for its first benefactor, the Puritan clergyman John Harvard, it is the oldest institution of higher learning in the United States and among the most prestigious in the world.\n" +
                    "\n" +
                    "The university is composed of ten academic faculties plus the Harvard Radcliffe Institute. Arts and Sciences offers study in a wide range of academic disciplines for undergraduates and for graduates, while the other faculties offer only graduate degrees, mostly professional.",
            "Koç University (Turkish: Koç Üniversitesi) is a non-profit private university in Istanbul, Turkey.[1] It started education in temporary buildings in İstinye in 1993, and moved to its current Rumelifeneri campus near Sarıyer in 2000.[9] Koç University is ranked highest in Turkey according to the 2022 Times Higher Education World University Rankings and 2022 QS World University Rankings.\n" +
                    "\n" +
                    "Founded in 1993, Koç University has become one of the most prestigious universities in Turkey. The university attracts many of the highest-scoring students from Turkey's top high schools such as Koç School, Robert College, Uskudar American Academy and Istanbul High School.",
            "The National University of Singapore (NUS) is a national research university in Singapore. Founded in 1905 as the Straits Settlements and Federated Malay States Government Medical School, NUS is the oldest autonomous university in the country.\n" +
                    "\n" +
                    "NUS has consistently been considered as being one of the most prestigious academic institutions in the world as well as in Asia itself. It has consistently featured in the world's top 100 universities as ranked by the Academic Ranking of World Universities, the QS World University Rankings, and the Times Higher Education World University Rankings.",
            "Kyoto University is one of Asia’s leading research-oriented institutions and is famed for producing world-beating researchers, including 13 Nobel Prize laureates. \n" +
                    "\n" +
                    "The motto of the school, which was founded in 1897, is “freedom of academic spirit”, a value it aims to instill on the 22,000 students enrolled on its undergraduate and graduate programs. \n" +
                    "\n" +
                    "Kyoto ranks competitively in most major rankings, usually coming in the top two for Japan, the top 10 for Asia, and in the top 50 universities globally, making it a major player on the university scene.  \n" +
                    "\n" +
                    "The main Yoshida campus has been at the core of the university since its founding, and is notable for its fascinating architecture, encompassing a variety of styles, from brick buildings such as the Clock Tower Centennial Hall (a symbol of the university) to modern laboratory buildings. \n" +
                    "\n" +
                    "For those interested in Japanese culture, the city of Kyoto will be of interest as it’s the birthplace of manga and was the capital city of Japan for over 1,000 years. Numerous cultural assets cultivated throughout its long history remain all over the city, and one in every 10 people there is a university student – by far the highest proportion of any Japanese city. ",
            "Universitas Gadjah Mada (internationally known as Gadjah Mada University ; Abbreviation : UGM) is an Indonesian public ivy league research university located in Yogyakarta, Indonesia, founded on December 19, 1949. UGM is the oldest and largest institution of higher learning in Indonesia. Located in Yogyakarta, Indonesia, the 360 acre university comprises of 18 faculties, 68 undergraduate study programs, 23 diploma study programs, 104 master and spesialist study program, and 43 Doctorate study programs.\n" +
                    "\n" +
                    "Universitas Gadjah Mada has been considered to be one of the most prestigious universities in Indonesia.UGM is implementing an educopolis area, a step taken by universities in creating conducive environment for the continuity of the learning process. These efforts are pursued in the context of developing multidisciplinary collaborations and responding to ecological issues in order to achieve the vision of the university."

        )
        private val universityAkreditasi = arrayOf(
            "A",
            "A",
            "A",
            "A",
            "A",
            "A",
            "B",
            "B",
            "B",
            "B",

            )

        private val imgUniversity = intArrayOf(
            R.drawable.madinah,
            R.drawable.mit,
            R.drawable.cambridge,
            R.drawable.stanford,
            R.drawable.oxford,
            R.drawable.harvard,
            R.drawable.koc,
            R.drawable.singapore,
            R.drawable.kyoto,
            R.drawable.ugm
        )

        private val logoUniversity = intArrayOf(
            R.drawable.uim_logo,
            R.drawable.mit_logo,
            R.drawable.cambridge_logo,
            R.drawable.logostanford,
            R.drawable.oxford_logo,
            R.drawable.harvard_logo,
            R.drawable.koc_logo,
            R.drawable.nus_logo,
            R.drawable.kyoto_logo,
            R.drawable.ugm_logo
        )

        val listData: ArrayList<Hero>
            get() {
                val list = arrayListOf<Hero>()
                for (position in universityNames.indices) {
                    val university = Hero()
                    university.name = universityNames[position]
                    university.address = universityAddress[position]
                    university.accreditation = universityAkreditasi[position]
                    university.logo = logoUniversity[position]
                    university.photo = imgUniversity[position]
                    university.detail = universityDetail[position]

                    list.add(university)
                }
                return list
            }
    }
