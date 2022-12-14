package ar.com.mautech.ws.webservices.accionescanalesalternativos._2_0_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2017-08-29T14:00:25.025-03:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/2_0_0", name = "AccionesCanalesAlternativos")
@XmlSeeAlso({ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadoresponse._1_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.globales.mtechtiposbase._3_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.globales.mtechtipossoporte._3_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionescanalesalternativos.logincontarjetarequest._2_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionescanalesalternativos.registraroperacionesmonetariasrequest._2_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadorequest._1_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.globales.mtechheader._2_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionescanalesalternativos.registraradhesionmetodoautenticacionresponse._1_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionescanalesalternativos.registraradhesionmetodoautenticacionrequest._1_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionescanalesalternativos.registraroperacionesmonetariasresponse._2_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionescanalesalternativos.logincontarjetaresponse._2_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionescanalesalternativos.registrarinteraccionesresponse._2_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientejuridicoconidentificacionrequest._2_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientefisicoconidentificacionrequest._2_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientefisicoconidentificacionresponse._2_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientejuridicoconidentificacionresponse._2_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.globales.mtechresultadooperacion._2_0_0.ObjectFactory.class, ar.com.mautech.ws.webservices.accionescanalesalternativos.registrarinteraccionesrequest._2_0_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AccionesCanalesAlternativos {

    @WebResult(name = "LoginClienteJuridicoConIdentificacionResult", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientejuridicoconidentificacionresponse/2_0_0", partName = "parameters")
    @WebMethod(operationName = "LoginClienteJuridicoConIdentificacion", action = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientejuridicoconidentificacion")
    public ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientejuridicoconidentificacionresponse._2_0_0.LoginClienteJuridicoConIdentificacionResult loginClienteJuridicoConIdentificacion(
        @WebParam(partName = "parameters", name = "LoginClienteJuridicoConIdentificacion", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientejuridicoconidentificacionrequest/2_0_0")
        ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientejuridicoconidentificacionrequest._2_0_0.LoginClienteJuridicoConIdentificacion parameters
    ) throws mtechResultadoOperacionFalla;

    @WebResult(name = "RegistrarAdhesionMetodoAutenticacionResult", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registraradhesionmetodoautenticacionresponse/1_0_0", partName = "parameters")
    @WebMethod(operationName = "RegistrarAdhesionMetodoAutenticacion", action = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registraradhesionmetodoautenticacion")
    public ar.com.mautech.ws.webservices.accionescanalesalternativos.registraradhesionmetodoautenticacionresponse._1_0_0.RegistrarAdhesionMetodoAutenticacionResult registrarAdhesionMetodoAutenticacion(
        @WebParam(partName = "parameters", name = "RegistrarAdhesionMetodoAutenticacion", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registraradhesionmetodoautenticacionrequest/1_0_0")
        ar.com.mautech.ws.webservices.accionescanalesalternativos.registraradhesionmetodoautenticacionrequest._1_0_0.RegistrarAdhesionMetodoAutenticacion parameters
    ) throws mtechResultadoOperacionFalla;

    @WebResult(name = "LoginClienteSimplificadoResult", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientesimplificadoresponse/1_0_0", partName = "parameters")
    @WebMethod(operationName = "LoginClienteSimplificado", action = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientesimplificado")
    public ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadoresponse._1_0_0.LoginClienteSimplificadoResult loginClienteSimplificado(
        @WebParam(partName = "parameters", name = "LoginClienteSimplificado", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientesimplificadorequest/1_0_0")
        ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientesimplificadorequest._1_0_0.LoginClienteSimplificado parameters
    ) throws mtechResultadoOperacionFalla;

    @WebResult(name = "LoginClienteFisicoConIdentificacionResult", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacionresponse/2_0_0", partName = "parameters")
    @WebMethod(operationName = "LoginClienteFisicoConIdentificacion", action = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacion")
    public ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientefisicoconidentificacionresponse._2_0_0.LoginClienteFisicoConIdentificacionResult loginClienteFisicoConIdentificacion(
        @WebParam(partName = "parameters", name = "LoginClienteFisicoConIdentificacion", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/loginclientefisicoconidentificacionrequest/2_0_0")
        ar.com.mautech.ws.webservices.accionescanalesalternativos.loginclientefisicoconidentificacionrequest._2_0_0.LoginClienteFisicoConIdentificacion parameters
    ) throws mtechResultadoOperacionFalla;

    @WebResult(name = "LoginConTarjetaResult", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/logincontarjetaresponse/2_0_0", partName = "parameters")
    @WebMethod(operationName = "LoginConTarjeta", action = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/logincontarjeta")
    public ar.com.mautech.ws.webservices.accionescanalesalternativos.logincontarjetaresponse._2_0_0.LoginConTarjetaResult loginConTarjeta(
        @WebParam(partName = "parameters", name = "LoginConTarjeta", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/logincontarjetarequest/2_0_0")
        ar.com.mautech.ws.webservices.accionescanalesalternativos.logincontarjetarequest._2_0_0.LoginConTarjeta parameters
    ) throws mtechResultadoOperacionFalla;

    @WebResult(name = "RegistrarOperacionesMonetariasResult", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registraroperacionesmonetariasresponse/2_0_0", partName = "parameters")
    @WebMethod(operationName = "RegistrarOperacionesMonetarias", action = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registraroperacionesmonetarias")
    public ar.com.mautech.ws.webservices.accionescanalesalternativos.registraroperacionesmonetariasresponse._2_0_0.RegistrarOperacionesMonetariasResult registrarOperacionesMonetarias(
        @WebParam(partName = "parameters", name = "RegistrarOperacionesMonetarias", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registraroperacionesmonetariasrequest/2_0_0")
        ar.com.mautech.ws.webservices.accionescanalesalternativos.registraroperacionesmonetariasrequest._2_0_0.RegistrarOperacionesMonetarias parameters
    ) throws mtechResultadoOperacionFalla;

    @WebResult(name = "RegistrarInteraccionesResult", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registrarinteraccionesresponse/2_0_0", partName = "parameters")
    @WebMethod(operationName = "RegistrarInteracciones", action = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registrarinteracciones")
    public ar.com.mautech.ws.webservices.accionescanalesalternativos.registrarinteraccionesresponse._2_0_0.RegistrarInteraccionesResult registrarInteracciones(
        @WebParam(partName = "parameters", name = "RegistrarInteracciones", targetNamespace = "http://ws.mautech.com.ar/webservices/accionescanalesalternativos/registrarinteraccionesrequest/2_0_0")
        ar.com.mautech.ws.webservices.accionescanalesalternativos.registrarinteraccionesrequest._2_0_0.RegistrarInteracciones parameters
    ) throws mtechResultadoOperacionFalla;
}
