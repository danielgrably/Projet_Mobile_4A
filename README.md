# Projet_Mobile_4A: APPLICATION CALENDAR

## Développeur (4A)

- Daniel Elgrably


&nbsp;

## Présentation

Ce projet a pour principaux buts l'utilisation d'appel WebService à une API REST et de liste de view dans une application android, scindée en Fragments, codé en Java.

Cette application affiche le calendrier des chabbats et fêtes juives en utilisant l'API suivante disponible sur Github : "https://www.hebcal.com/home/195/jewish-calendar-rest-api". Par ailleurs, toujours avec cette API, nous pouvons afficher les montées du chabat. En effet, chaque chabbat, nous lisons une section des livres du pentateuque, de façons à les finir en un ans. Cette section est subdivisée en 7 montées (sous section). Enfin, le "maftir" reprend les derniers versets de la septième montée. Puis la haftarah est constituée d'un passage tiré des livres des prophètes. 


&nbsp;

## Prérequis

- Installation d'Android Studio</br>
Ce projet est le deuxième que je réalise sous Android Studio, il n'y avait pas d'autres prérequis.


&nbsp;

## Consignes respectées : 

- Deux écrans; trois activités
- Recycler View
- Appels WebService à une API Rest
- Architecture MVC
- Animation entre deux écrans
- Autres fonctionnalités 
  - Changement logo de l'application 
  - Supression élèment par swip
  - Toast message


&nbsp;

## Architecture du projet:

### Model
* Calendar : -------------->*Objet contenant les informations récupérées de l'API*
* Leyning : --------------->*Objet dans calendar contenant les montées et lectures*
* RestCalendarResponse

### View
* MainActivity : ----------->*Pour l'écran d'accueil, avec les fonctions appelées pour les trois boutons*
* SecondActivity : -------->*Affichage du calendrier* 
* ThirdActivity : ---------->*Affichage des montées et lectures*

### Controler
* Cont : -------------------->*Constructeur pour la SecondActivity*
* Cont_bis : ---------------->*Constructeur pour la ThirdActivity*
* MyAdapter : ------------->*Adapteur pour la SecondActivity*
* MyAdapter_bis:----------->*Adapteur pour la ThirdActivity*
* RestCalendarAPI

&nbsp;

## Fonctionnalités: 

### Premier écran 

L'écran qui s'affiche au démarrage est l'écran d'accueil. Au commencement du chabbat ou des fêtes, nous avons l'habitude d'allumer deux bougies, c'est ce qui est représenté par le fond d'écran.</br>
Outre le titre, trois boutons sont proposés à l'utilsateur.
- Le premier, "Calendrier et horaires" ouvre une seconde activité affichant les prochains évènements.
- Le second, "Montées chabbat" ouvre une troisième activité affichant la répartition des montées pour la lecture de chabat.
- Le troisième, "Créateur" affiche un toast avec mon nom.


<img src="img_readme/Frag_Menu.png" width="200" alt="ecran accueil">

### Second Fragment

- Affiche la liste des montées des lectures hebdomadaires.

<img src="img_readme/Frag_Chabbat.png" width="200" alt="liste évènement">   

### Troisième FRagment

- Affiche la liste des prochains évènement avec leur catégorie, leur noms en anglais et en hébreu, ainsi que leur date.

<img src="img_readme/Frag_Calendrier.png" width="200" alt="liste montées">  

