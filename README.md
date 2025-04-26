# IOC_spring

Ce projet est un exemple d'injection de dépendances (IoC - Inversion of Control) avec **Spring Framework** en Java.

## Structure du projet

- `dao/`
  - `IDao.java` : Interface DAO.
  - `DaoImpl.java` : Première implémentation de l'interface DAO.
  - `DaoImplV2.java` : Deuxième implémentation possible.

- `metier/`
  - `IMetier.java` : Interface métier.
  - `MetierImpl.java` : Implémentation métier utilisant une DAO.

- `presentation/`
  - `presSpringAnnotation.java` : Présentation utilisant Spring et l'annotation `@Component`.
  - `presSpringXml.java` : Présentation utilisant la configuration XML (`config.xml`).

- `resources/`
  - `config.xml` : Fichier de configuration Spring en XML.

## Fonctionnement

- Le projet utilise **l'injection de dépendances** via **annotations** (`@Component`, `@Autowired`, `@Qualifier`) et **XML**.
- La classe `MetierImpl` dépend de `IDao` pour effectuer ses calculs.
- Le résultat final est affiché dans la console avec `System.out.println(metier.calcul());`.

## Instructions pour exécuter

1. Cloner le projet :
    ```bash
    git clone https://github.com/saadinede/IOC_spring.git
    ```

2. Ouvrir dans **IntelliJ IDEA** ou un autre IDE Java compatible.

3. Exécuter la classe :
   - Pour l'annotation : `presSpringAnnotation`
   - Pour la configuration XML : `presSpringXml`

## Remarques

- Assurez-vous que le package scanné dans `AnnotationConfigApplicationContext` est bien `"org.example"`.
- Les Beans doivent être correctement annotés avec `@Component` pour être détectés.

---

## Auteur

- [Saadeddine](https://github.com/saadinede)

