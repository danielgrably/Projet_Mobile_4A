# Projet_Mobile_4A: APPLICATION CALENDAR

## Développeur (4A)

- Daniel Elgrably


&nbsp;

## Présentation

Ce projet a pour principaux buts l'utilisation d'appel WebService à une API REST ainsi que des listes de view dans une application android, scindée en Fragments, codée en Java.

Cette application affiche le calendrier des chabbats et fêtes juives en utilisant l'API suivante disponible sur Github :
````
https://www.hebcal.com/home/195/jewish-calendar-rest-api
````
Par ailleurs, toujours avec cette API, nous pouvons afficher les montées du chabat. En effet, chaque chabbat, nous lisons une section des livres du pentateuque, de façons à les finir en un ans. Cette section est subdivisée en 7 montées (sous section). Enfin, le "maftir" reprend les derniers versets de la septième montée. Puis la haftarah est constituée d'un passage tiré des livres des prophètes. 


&nbsp;

## Prérequis

- Installation d'Android Studio</br>
Ce projet est le deuxième que je réalise sous Android Studio. 
- J'ai donc récupéré le précédent projet, disponible dans le répertoire ````https://github.com/danielgrably/Calendar````.</br>
Je l'ai retravaillé pour lui accorder de nouvelles fonctionnalitées.
- Il n'y avait pas d'autres prérequis.


&nbsp;

## Consignes respectées : 

- Trois Fragments
- RecyclerView, DrawerLayout, LinearLayout, AppBar, ToolBar 
- Appels WebService à une API Rest
- Architecture MVC
- Material Design
- Sauvegarde en cache
- Autres fonctionnalités 
  - Changement logo de l'application + logos sur les Tab 
  - Supression élèment par swip
  - Toast message
  - Changement de fond et animation lors des déplacements entre les Fragments
  - Déplacement en swippant


&nbsp;

## Architecture du projet:

### Model
* Calendar : -------------->*Objet contenant les informations récupérées de l'API*
* Leyning : --------------->*Objet dans calendar contenant les montées et lectures*
* RestCalendarResponse

### View
* MainActivity : ----------->*Pour l'écran d'accueil, fonction pour les déplacements entre fragments et définitions des divers éléments Toolbar, TabLayout, TabItem, DrawerLayout, ViewPager*
* MenuFragment : -------->*Affichage du Fragment menu avec le Toast* 
* ChabbatFragment : ---------->*Affichage du Fragment Chabbat contenant la liste des montées et lectures*
* CalendrierFragment : ---------->*Affichage du Fragment Calendrier contenant la liste des évènements à venir*

### Controler
* Cont : -------------------->*Constructeur pour le CalendrierFragment*
* Cont_bis : ---------------->*Constructeur pour le ChabbatFragment*
* MyAdapter : ------------->*Adapteur pour le CalendrierFragment*
* MyAdapter_bis:----------->*Adapteur pour le ChabbatFragment*
* RestCalendarAPI

&nbsp;

## Fonctionnalités: 

### Premier écran 

L'écran qui s'affiche au démarrage est l'écran d'accueil. Au commencement du chabbat ou des fêtes, nous avons l'habitude d'allumer deux bougies, c'est ce qui est représenté par le fond d'écran.</br>
Outre le titre, trois items dominant la page sont proposés à l'utilsateur.
- Le premier, "Menu" c'est le fragment sur lequel il se trouve lors de l'ouverture de l'application. 
- Le second, "Chabbat" ouvre le deuxième fragment affichant la répartition des montées pour la lecture de chabat.
- Le troisième, "Calendrier" ouvre le troisième fragment affichant les prochains évènements.


<img src="img_readme/Frag_Menu.JPG" width="200" alt="Frag_Menu">

### Second Fragment

Affiche la liste des montées des lectures hebdomadaires.

<img src="img_readme/Frag_Chabbat.JPG" width="200" alt="Frag_Chabbat">   

### Troisième Fragment

Affiche la liste des prochains évènements avec leur catégorie, leur noms en anglais et en hébreu, ainsi que leur date.

<img src="img_readme/Frag_Calendrier.JPG" width="200" alt="Frag_Calendrier">  


&nbsp;

## Apprentissage:

Le fait de réaliser un nouveau projet d'application mobile m'a permis d'apprendre de nombreuses choses :
- Au démarrage, j'ai souhaité repartir de mon projet réalisé l'année dernière. J'ai d'abords pris le temps de voir ce que j'avais déjà fais pour avoir une vision d'ensemble. J'ai pu lister les fonctionnalités qui marchaient et celle que je souhaitais ajouter pour la nouvelle application. 
- Pour commencer, j'ai modifié ce que je trouvais incomplet ou améliorable dans la version précédente.
- L'une des consignes demandées est le Design. J'en ai profité pour le retravailler en changeant certaines images et logos. Mais surtout, j'ai suivi le Tuto Codelab pour Material Design ("https://codelabs.developers.google.com/codelabs/material-design-style/#0").
Cela m'a permis de présenter un meilleur Design et d'intégrer les différents élèments comme la ToolBar, l'AppBar et d'autres view qui ne figuraient pas l'année dernière.
- La partie la plus importante de ce tuto était la construction des fragments de l'application. Je n'ai eu qu'à me servir des activity que j'avais codé l'année dernière pour les transformer en fragments. Les adapteurs et constructeurs n'ont pas eu besoin d'être beaucoup modifiés. Il m'a fallu comprendre le mécanisme des fragments, les classes et layouts correspondants,  les fonctions nécessaires à leur implémentation et leur affichage.
- Ce que je trouve intéressant pour la conception d'application mobile c'est que la documentation est très riche. Si je voulais ajouter des fonctionnalités, des animations ou des images, il était assez facile de trouver de quoi s'informer pour le réaliser. Evidemment, il faut à chaque fois comprendre ce qui est présenté pour l'intégrer comme il se doit à mon projet. 
- Concernant les erreurs également, j'ai utilisé les retours de Logcat pour résoudre les problèmes ou bugs potentiels. Là aussi, en prenant de l'expérience, on comprend mieux quelles sont les fautes et comment les corriger. 
- Enfin, ce n'est pas la première fois que j'utlise GitHub pour déposer un projet, je commence à en prendre les automatismes. Après avoir chargé  le projet de troisième année sur la branche master, j'ai créé une branche dev pour avancer sur l'application. J'ai essayé de bien nommer mes commits afin de comprendre ce qu'ils ont apporté comme modifications. A la fin, il ne manqua plus que de "merger" les branches pour que la master soit à jour.

