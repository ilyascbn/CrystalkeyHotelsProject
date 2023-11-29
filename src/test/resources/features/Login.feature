@login
@Regression
Feature: US 001 hotel Login

  Background:
    Given Kullanıcı CRYSTALKEY HOTELS sayfasına gider
    And Kullanıcı sağ üstteki Log in butonuna tıklar


  @US01 @TC01
  Scenario Outline:TC001 Giriş yapmak için geçerli bir kullanıcı adı ve şifre olmalıdır
    And Kullanıcı açılan menude username Text Bax'a tıklar
    And Kullanıcı açılan menude username Text Box'a "<username>" yazar
    And Kullanıcı Password Textbox'a "<password>" yazar
    And Kullanıcı Log in butonuna tıklar
    And Kullanıcı manager sayfasına ulaşmış olur

    Examples: Test Data
      | username | password   |
      | ercument | Pasaport123. |


