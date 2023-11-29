@Regression
@HotelLogin
Feature: US 02 hotel Login

  Background:
    Given Kullanıcı CRYSTALKEY HOTELS sayfasına gider
    And Kullanıcı sağ üstteki Log in butonuna tıklar


@US02  @TC011
Scenario Outline:TC_001 Kullanıcı, geçersiz kullanıcı adı ile oturum açamaz
And Kullanıcı açılan menude username Text Bax'a tıklar
And Kullanıcı açılan menude username Text Box'a "<username>" yazar
And Kullanıcı Password Textbox'a "<password>" yazar
And Kullanıcı Log in butonuna tıklar
And "Try again please Username or password is incorrect, please correct them and try again Wrong password"mesajını görür

Examples:
| username  | password   |
| EErcumentt | Pasaport123. |

@US02  @TC022
Scenario Outline:TC_002 Kullanıcı, geçersiz parola ile oturum açamaz
And Kullanıcı açılan menude username Text Bax'a tıklar
And Kullanıcı açılan menude username Text Box'a "<username>" yazar
And Kullanıcı Password Textbox'a "<password>" yazar
And Kullanıcı Log in butonuna tıklar
And "Try again please Username or password is incorrect, please correct them and try again Wrong password"mesajını görür

Examples:
| username | password   |
| ercument | ppasaport123. |

@US02  @TC033
Scenario Outline:TC_003 Kullanıcı, geçersiz kullanıcı adı ve parola ile oturum açamaz
And Kullanıcı açılan menude username Text Bax'a tıklar
And Kullanıcı açılan menude username Text Box'a "<username>" yazar
And Kullanıcı Password Textbox'a "<password>" yazar
And Kullanıcı Log in butonuna tıklar
And "Try again please Username or password is incorrect, please correct them and try again Wrong password"mesajını görür

Examples:
| username | password    |
| EErcument | ppasaport123. |

