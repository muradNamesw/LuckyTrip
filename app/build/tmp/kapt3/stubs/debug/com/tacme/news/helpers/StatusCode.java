package com.tacme.news.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\bE\b\u0086\u0001\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001GB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bF\u00a8\u0006H"}, d2 = {"Lcom/tacme/news/helpers/StatusCode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "unknown", "ok", "created", "accepted", "nonAuthoritativeInformation", "noContent", "resetContent", "partialContent", "multiStatus", "alreadyReported", "imUsed", "multipleChoices", "movedPermanently", "found", "seeOther", "notModified", "useProxy", "unused", "temporaryRedirect", "permanentRedirect", "badRequest", "unauthorized", "paymentRequired", "forbidden", "notFound", "methodNotAllowed", "notAcceptable", "proxyAuthenticationRequired", "requestTimeout", "conflict", "gone", "lengthRequired", "preconditionFailed", "requestEntityTooLarge", "requestUriTooLong", "unsupportedMediaType", "requestedRangeNotSatisfiable", "expectationFailed", "imATeapot", "misdirectedRequest", "unprocessableEntity", "locked", "failedDependency", "upgradeRequired", "preconditionRequired", "tooManyRequests", "requestHeaderFieldsTooLarge", "connectionClosedWithoutResponse", "unavailableForLegalReasons", "clientClosedRequest", "internalServerError", "notImplemented", "badGateway", "serviceUnavailable", "gatewayTimeout", "httpVersionNotSupported", "variantAlsoNegotiates", "insufficientStorage", "loopDetected", "notExtended", "networkAuthenticationRequired", "networkConnectTimeoutError", "Companion", "app_debug"})
public enum StatusCode {
    /*public static final*/ unknown /* = new unknown(0) */,
    /*public static final*/ ok /* = new ok(0) */,
    /*public static final*/ created /* = new created(0) */,
    /*public static final*/ accepted /* = new accepted(0) */,
    /*public static final*/ nonAuthoritativeInformation /* = new nonAuthoritativeInformation(0) */,
    /*public static final*/ noContent /* = new noContent(0) */,
    /*public static final*/ resetContent /* = new resetContent(0) */,
    /*public static final*/ partialContent /* = new partialContent(0) */,
    /*public static final*/ multiStatus /* = new multiStatus(0) */,
    /*public static final*/ alreadyReported /* = new alreadyReported(0) */,
    /*public static final*/ imUsed /* = new imUsed(0) */,
    /*public static final*/ multipleChoices /* = new multipleChoices(0) */,
    /*public static final*/ movedPermanently /* = new movedPermanently(0) */,
    /*public static final*/ found /* = new found(0) */,
    /*public static final*/ seeOther /* = new seeOther(0) */,
    /*public static final*/ notModified /* = new notModified(0) */,
    /*public static final*/ useProxy /* = new useProxy(0) */,
    /*public static final*/ unused /* = new unused(0) */,
    /*public static final*/ temporaryRedirect /* = new temporaryRedirect(0) */,
    /*public static final*/ permanentRedirect /* = new permanentRedirect(0) */,
    /*public static final*/ badRequest /* = new badRequest(0) */,
    /*public static final*/ unauthorized /* = new unauthorized(0) */,
    /*public static final*/ paymentRequired /* = new paymentRequired(0) */,
    /*public static final*/ forbidden /* = new forbidden(0) */,
    /*public static final*/ notFound /* = new notFound(0) */,
    /*public static final*/ methodNotAllowed /* = new methodNotAllowed(0) */,
    /*public static final*/ notAcceptable /* = new notAcceptable(0) */,
    /*public static final*/ proxyAuthenticationRequired /* = new proxyAuthenticationRequired(0) */,
    /*public static final*/ requestTimeout /* = new requestTimeout(0) */,
    /*public static final*/ conflict /* = new conflict(0) */,
    /*public static final*/ gone /* = new gone(0) */,
    /*public static final*/ lengthRequired /* = new lengthRequired(0) */,
    /*public static final*/ preconditionFailed /* = new preconditionFailed(0) */,
    /*public static final*/ requestEntityTooLarge /* = new requestEntityTooLarge(0) */,
    /*public static final*/ requestUriTooLong /* = new requestUriTooLong(0) */,
    /*public static final*/ unsupportedMediaType /* = new unsupportedMediaType(0) */,
    /*public static final*/ requestedRangeNotSatisfiable /* = new requestedRangeNotSatisfiable(0) */,
    /*public static final*/ expectationFailed /* = new expectationFailed(0) */,
    /*public static final*/ imATeapot /* = new imATeapot(0) */,
    /*public static final*/ misdirectedRequest /* = new misdirectedRequest(0) */,
    /*public static final*/ unprocessableEntity /* = new unprocessableEntity(0) */,
    /*public static final*/ locked /* = new locked(0) */,
    /*public static final*/ failedDependency /* = new failedDependency(0) */,
    /*public static final*/ upgradeRequired /* = new upgradeRequired(0) */,
    /*public static final*/ preconditionRequired /* = new preconditionRequired(0) */,
    /*public static final*/ tooManyRequests /* = new tooManyRequests(0) */,
    /*public static final*/ requestHeaderFieldsTooLarge /* = new requestHeaderFieldsTooLarge(0) */,
    /*public static final*/ connectionClosedWithoutResponse /* = new connectionClosedWithoutResponse(0) */,
    /*public static final*/ unavailableForLegalReasons /* = new unavailableForLegalReasons(0) */,
    /*public static final*/ clientClosedRequest /* = new clientClosedRequest(0) */,
    /*public static final*/ internalServerError /* = new internalServerError(0) */,
    /*public static final*/ notImplemented /* = new notImplemented(0) */,
    /*public static final*/ badGateway /* = new badGateway(0) */,
    /*public static final*/ serviceUnavailable /* = new serviceUnavailable(0) */,
    /*public static final*/ gatewayTimeout /* = new gatewayTimeout(0) */,
    /*public static final*/ httpVersionNotSupported /* = new httpVersionNotSupported(0) */,
    /*public static final*/ variantAlsoNegotiates /* = new variantAlsoNegotiates(0) */,
    /*public static final*/ insufficientStorage /* = new insufficientStorage(0) */,
    /*public static final*/ loopDetected /* = new loopDetected(0) */,
    /*public static final*/ notExtended /* = new notExtended(0) */,
    /*public static final*/ networkAuthenticationRequired /* = new networkAuthenticationRequired(0) */,
    /*public static final*/ networkConnectTimeoutError /* = new networkConnectTimeoutError(0) */;
    private int value;
    @org.jetbrains.annotations.NotNull()
    public static final com.tacme.news.helpers.StatusCode.Companion Companion = null;
    
    StatusCode(int value) {
    }
    
    public final int getValue() {
        return 0;
    }
    
    public final void setValue(int p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tacme/news/helpers/StatusCode$Companion;", "", "()V", "getByValue", "Lcom/tacme/news/helpers/StatusCode;", "value", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tacme.news.helpers.StatusCode getByValue(int value) {
            return null;
        }
    }
}