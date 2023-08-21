# build-logic

# Gradle Setting Centralization Steps
1. Create "build-logic" folder
2. Add this folder into settings.gradle.kts(project) -- It will be a module
3. Add build.gradle.kts
4. Add settings.gradle.kts
5. Create kotlin/java source folder
6. Write your plugins



# Tutorial 
Android Gradle plugin : It knows how to build and package and Android project, whether it's an app or 
library gradle build tool work with different projects because of plugins. For example for android 
project AGP adds capabilities in gradle
Defines its own tasks and knows in which order these tasks need to run to build an android project
Gradle parses android {} dsl block and convert it an AGP DSL object

During build:
- Initialization phase = At first look which projects are included in the build and create a project 
instance for each project(setting.gradle.kts)
- Configuration phase = Evaluates all build scripts for the project included(all build files : 
build.gradle.kts), applies plugins configures the build gradle by using dsl object and finally register tasks lazily
- Execution phrase = executes the set of tasks needed for build