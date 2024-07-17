# Spring Profiles 

# Introduction

Spring Profiles allow you to create multiple configurations for your application that can be activated based on the environment in which the application is running. By using profiles, you can maintain separate configurations for development, testing, and production environments, and switch between them seamlessly.

**Understanding the Terms**

**1) Properties:** These are configuration settings or parameters that your application needs to run properly. They might include database URLs, API keys, feature flags, etc.

**2)Env (Environment):** This refers to the specific context in which your application is running. Common environments include:

**Dev (Development):** The environment where developers build and test new features.

**QA (Quality Assurance):** The environment where the application is tested for quality assurance and stability before going live.

**Prod (Production):** The live environment where the application is used by end-users.

**3)Profiles:** In this context, profiles refer to different sets of configuration settings for each environment. By using profiles, you can manage and switch between configurations specific to each environment easily.

**4)Configuration YAML:** YAML (YAML Ain't Markup Language) is a human-readable data serialization standard that can be used for configuration files. It allows you to define configuration settings in a structured way.

**Setting Up Profiles**

**1)Define Profiles in Configuration Files**

In Spring Boot, you typically use application.properties or application.yml files to configure your application. To set up profiles, you create different configuration files for each profile:

**application-dev.yml** for development
**application-qa.yml** for QA
**application-prod.yml** for production

Each file will contain the environment-specific properties.

**2)Single YAML File with Profiles:**

**development:**

  database:
  
    url: "jdbc:mysql://localhost/dev_db"
    
    user: "dev_user"
    
    password: "dev_password"
    
  api:
  
    key: "dev_api_key"
    
    endpoint: "https://dev.api.example.com"

**test:**

  database:
  
    url: "jdbc:mysql://localhost/test_db"
    
    user: "test_user"
    
    password: "test_password"
    
  api:
  
    key: "test_api_key"
    
    endpoint: "https://test.api.example.com"

**production:**

  database:
  
    url: "jdbc:mysql://localhost/prod_db"
    
    user: "prod_user"
    
    password: "prod_password"
    
  api:
  
    key: "prod_api_key"
    
    endpoint: "https://api.example.com"
    
