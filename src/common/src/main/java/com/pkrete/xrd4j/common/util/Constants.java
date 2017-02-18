package com.pkrete.xrd4j.common.util;

/**
 * This class defines a set of constants used by other classes of the
 * application.
 *
 * @author Petteri Kivimäki
 */
public class Constants {

    // Namespace definitions
    /**
     * Identifiers schema namespace prefix.
     */
    public static final String NS_ID_PREFIX = "id";
    /**
     * Identifiers schema namespace URI.
     */
    public static final String NS_ID_URL = "http://x-road.eu/xsd/identifiers";
    /**
     * XRd schema namespace prefix.
     */
    public static final String NS_XRD_PREFIX = "xrd";
    /**
     * XRd schema namespace URI.
     */
    public static final String NS_XRD_URL = "http://x-road.eu/xsd/xroad.xsd";
    /**
     * Environmental monitoring namespace prefix.
     */
    public static final String NS_ENV_MONITORING_PREFIX = "m";
    /**
     * Environmental monitoring namespace URI.
     */
    public static final String NS_ENV_MONITORING_URL = "http://x-road.eu/xsd/monitoring";
    // Attributes
    /**
     * Object type attribute name.
     */
    public static final String NS_ID_ATTR_OBJECT_TYPE = "objectType";
    /**
     * Algorithm id attribute name.
     */
    public static final String ATTR_ALGORITHM_ID = "algorithmId";
    // Elements
    /**
     * Client element name.
     */
    public static final String NS_XRD_ELEM_CLIENT = "client";
    /**
     * Service element name.
     */
    public static final String NS_XRD_ELEM_SERVICE = "service";
    /**
     * Member element name.
     */
    public static final String NS_XRD_ELEM_MEMBER = "member";
    /**
     * Security server element name.
     */
    public static final String NS_XRD_ELEM_SECURITY_SERVER = "securityServer";
    /**
     * CentralService element name.
     */
    public static final String NS_XRD_ELEM_CENTRAL_SERVICE = "centralService";
    /**
     * CentralServiceList element name.
     */
    public static final String NS_XRD_ELEM_CENTRAL_SERVICE_LIST = "centralServiceList";
    /**
     * ClientList element name.
     */
    public static final String NS_XRD_ELEM_CLIENT_LIST = "clientList";
    /**
     * Id element name.
     */
    public static final String NS_XRD_ELEM_ID = "id";
    /**
     * User id element name.
     */
    public static final String NS_XRD_ELEM_USER_ID = "userId";
    /**
     * Issue element name.
     */
    public static final String NS_XRD_ELEM_ISSUE = "issue";
    /**
     * Request hash element name.
     */
    public static final String NS_XRD_ELEM_REQUEST_HASH = "requestHash";
    /**
     * Protocol version element name.
     */
    public static final String NS_XRD_ELEM_PROTOCOL_VERSION = "protocolVersion";
    /**
     * SDSB instance element name.
     */
    public static final String NS_ID_ELEM_XROAD_INSTANCE = "xRoadInstance";
    /**
     * Member class element name.
     */
    public static final String NS_ID_ELEM_MEMBER_CLASS = "memberClass";
    /**
     * Member code element name.
     */
    public static final String NS_ID_ELEM_MEMBER_CODE = "memberCode";
    /**
     * Subsystem code element name.
     */
    public static final String NS_ID_ELEM_SUBSYSTEM_CODE = "subsystemCode";
    /**
     * Service code element name.
     */
    public static final String NS_ID_ELEM_SERVICE_CODE = "serviceCode";
    /**
     * Server code element name.
     */
    public static final String NS_ID_ELEM_SERVER_CODE = "serverCode";
    /**
     * Service version element name.
     */
    public static final String NS_ID_ELEM_SERVICE_VERSION = "serviceVersion";
    // Environmental monitoring
    /**
     * Packages name.
     */
    public static final String NS_ENV_MONITORING_ELEM_PACKAGES = "Packages";
    /**
     * Metric set element name.
     */
    public static final String NS_ENV_MONITORING_ELEM_METRIC_SET = "metricSet";
    /**
     * stringMetric element name.
     */
    public static final String NS_ENV_MONITORING_ELEM_STRING_METRIC = "stringMetric";
    // Meta services
    /**
     * listClients meta service.
     */
    public static final String META_SERVICE_LIST_CLIENTS = "listClients";
    /**
     * listCentralServices meta service.
     */
    public static final String META_SERVICE_LIST_CENTRAL_SERVICES = "listCentralServices";
    /**
     * listMethods meta service.
     */
    public static final String META_SERVICE_LIST_METHODS = "listMethods";
    /**
     * allowedMethods meta service.
     */
    public static final String META_SERVICE_ALLOWED_METHODS = "allowedMethods";
    /**
     *
     */
    public static final String ENV_MONITORING_GET_SECURITY_SERVER_METRICS = "getSecurityServerMetrics";
    // HTTP Headers
    /**
     * Content-Type: text/xml
     */
    public static final String TEXT_XML = "text/xml";
    /**
     * Content-Type: application/xml
     */
    public static final String APPLICATION_XML = "application/xml";
    /**
     * Content-Type: application/json
     */
    public static final String APPLICATION_JSON = "application/json";
    /**
     * Content-Type: multipart/related
     */
    public static final String MULTIPART_RELATED = "multipart/related";
    /**
     * Default behavior for processing "request" and "response" wrappers.
     */
    public static final boolean DEFAULT_PROCESSING_WRAPPERS = true;

    /**
     * Constructs and initializes a new Constants object. Should never be used.
     */
    private Constants() {
    }
}
